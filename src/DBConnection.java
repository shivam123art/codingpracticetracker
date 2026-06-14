import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/coding_tracker",
                    "root",
                    "8979"
            );

            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}