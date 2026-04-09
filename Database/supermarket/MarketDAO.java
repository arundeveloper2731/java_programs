
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class MarketDAO 
{
 static Connection con;
    
     public static Connection getConnection() {

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/super_market";
            String user = "postgres";
            String password = "arun@1827";

            con = DriverManager.getConnection(url, user, password);
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return con;
    }
     public int customerDetails(MarketModelClass mm)
     {
         con = Connect();
         PreparedStatement ps = con.prepareStatement("insert into customer values ( )")
         
     }
     
}
