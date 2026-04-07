
package sudentwithdatabse;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
static Connection con;

    public static Connection getConnection() {

        try {
            String url = "jdbc:postgresql://localhost:5432/Student";
            String user = "postgres";
            String password = "arun@1827";

            con = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
