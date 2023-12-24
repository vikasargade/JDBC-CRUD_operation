import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {
    public static void main(String[] args) {

        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/j2ee";
        String userName = "root";
        String password = "tiger";

        try {
            conn = DriverManager.getConnection(url,userName,password);

            String query = "UPDATE  student set name='abbc' where rollno=110";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
