package th2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        th2.ConnectJDBC connectJDBC = new th2.ConnectJDBC();
        Connection conn = connectJDBC.connect();
        String query = "SELECT * FROM MatHang";

        Statement stm = null;
        try {
            stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                System.out.println(id + " - " + username + " - " + password + " - " + email);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}