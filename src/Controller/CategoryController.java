package Controller;

import Connection.MySqlConnection;
import Model.CategoryModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CategoryController {

    private MySqlConnection connection = new MySqlConnection();
    public List<CategoryModel> listCategory = new ArrayList<>();

    public CategoryController() {

    }

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

    public void getCategory(JTable table) {
        try {

            listCategory.clear();

            String sqlScript = "SELECT * FROM " + new CategoryModel().getTable() + "";
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.rs = connection.ps.executeQuery();
            while (connection.rs.next()) {
                listCategory.add(new CategoryModel(connection.rs.getInt("id"),
                        connection.rs.getString("category_title")));
            }
            DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
            defaultTableModel.setRowCount(0);
            listCategory.forEach(e -> {
                Object[] object = {
                    e.getId(),
                    e.getCategoryTitle(),};

                defaultTableModel.addRow(object);
            });

        } catch (Exception e) {
        }
    }

    public boolean updateCategory(CategoryModel categoryModel) {
        try {

            String sqlScript = "UPDATE category SET category_title=? WHERE id=? ";
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.ps.setString(1, categoryModel.getCategoryTitle());
            connection.ps.setInt(2, categoryModel.getId());

            if (connection.ps.executeLargeUpdate() > 0) {
                return true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
