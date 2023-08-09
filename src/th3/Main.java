package th3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();

        String query = "INSERT INTO user(id,username, password, email) " + "VALUES (?,?,?,?)";

        PreparedStatement pstm = null;
        try {
            pstm = ((Connection) conn).prepareStatement(query);
pstm.setInt(1,5);
            pstm.setString(2, "Do Bich Thuan");
            pstm.setString(3, "123456789");
            pstm.setString(4, "thuan.do@codegym.vn");

            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công " + row);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
