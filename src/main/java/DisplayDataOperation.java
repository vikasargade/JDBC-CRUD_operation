import java.sql.*;

public class DisplayDataOperation {

    public static void main(String[] args) {

        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/j2ee";
        String userName = "root";
        String password = "tiger";

        try {
            conn = DriverManager.getConnection(url,userName,password);

            String query ="select * from Student";
            Statement stmt = conn.createStatement();

            ResultSet rs =stmt.executeQuery(query);

            while(rs.next())
            {
                System.out.println(rs.getInt(1)
                +" "
                +rs.getString(2)
                +" "
                +rs.getDouble(3));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
