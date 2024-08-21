package Controller;

import Connection.MySqlConnection;
import Exceptions.ErrorException;
import Model.NewsModel;
import java.util.ArrayList;
import java.util.List;

public class NewsController {

    private MySqlConnection connection = new MySqlConnection();
    public List<NewsModel> listNews = new ArrayList<>();

    public boolean addNews(NewsModel model) {
        try {
            String sqlScript = "INSERT INTO news(title,description,thumbnail,category_id,user_id) VALUES (?,?,?,?,?)";
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.ps.setString(1, model.getTitle());
            connection.ps.setString(2, model.getDescription());
            connection.ps.setString(3, model.getThumbnail());
            connection.ps.setInt(4, model.getCategoryId());
            connection.ps.setInt(5, model.getUserId());
            if (connection.ps.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
        }
        return false;
    }

    public void getNews(int userId) {
        try {
            String sqlScript = "SELECT news.id,news.title,news.description,news.thumbnail,category.category_title AS category,\n"
                    + "CONCAT(user.first_name,\" \",user.last_name) AS fullname FROM news JOIN category ON news.category_id = category.id \n"
                    + "JOIN user ON news.user_id = user.id WHERE user_id = ?";
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.ps.setInt(1, userId);
            connection.rs = connection.ps.executeQuery();
            while (connection.rs.next()) {
                listNews.add(
                        new NewsModel(
                                connection.rs.getInt("id"),
                                connection.rs.getString("title"),
                                connection.rs.getString("description"),
                                connection.rs.getString("thumbnail"),
                                connection.rs.getString("category"),
                                connection.rs.getString("fullname"))
                );
            }
            
        } catch (Throwable e) {
            new ErrorException().errorMessage(e);
        }
    }
}
