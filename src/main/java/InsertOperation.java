import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
    public static void main(String[] args) {

        Connection conn =null;

        String userName="root";
        String password = "tiger";
        String url = "jdbc:mysql://localhost:3306/j2ee";


        try {
            conn = DriverManager.getConnection(url,userName,password);

            String query = "INSERT INTO STUDENT VALUES(110,'VIKi',80.99)";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
