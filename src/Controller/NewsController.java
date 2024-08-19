package Controller;

import Connection.MySqlConnection;
import Model.NewsModel;

public class NewsController {

    private MySqlConnection connection = new MySqlConnection();

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
}
