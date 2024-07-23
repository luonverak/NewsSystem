package Controller;

import Connection.MySqlConnection;
import Model.CategoryModel;

public class CategoryController {

    private MySqlConnection connection = new MySqlConnection();

    public boolean insertCategory(CategoryModel categoryModel) {
        try {
            
            String sqlScript = "INSERT INTO " + categoryModel.getTable() + "(category_title) VALUES(?)";
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.ps.setString(1, categoryModel.getCategoryTitle());
            
            if (connection.ps.executeLargeUpdate() > 0) {
                return true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
