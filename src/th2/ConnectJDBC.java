package th2;

import java.sql.*;

public class  ConnectJDBC{
    private String hostName = "localhost:3306";
    private String dbName = "new_QL";
    private String username = "root";
    private String password = "1";

    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){
        //Tạo đối tượng Connection
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}


