package Controller;

import Connection.MySqlConnection;
import Model.PositionModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PositionController {

    private MySqlConnection connection = new MySqlConnection();
    public List<PositionModel> positionModels = new ArrayList<>();

    public boolean insert(PositionModel positionModel) {
        try {
            String sqlScript = "INSERT INTO tbl_position (position) VALUES (?)";
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.ps.setString(1, positionModel.getPosition());
            if (connection.ps.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
        }
        return false;
    }

    public void getPosition(JTable table) {
        try {
            DefaultTableModel tableModel=(DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);
            String sqlScript = "SELECT * FROM tbl_position";
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.rs = connection.ps.executeQuery();
            while (connection.rs.next()) {
                
                Object object[]={
                   connection.rs.getInt("id"),
                    connection.rs.getString("position")
                };
                tableModel.addRow(object);
            }
            
            
        } catch (Exception e) {
        }
    }
}
