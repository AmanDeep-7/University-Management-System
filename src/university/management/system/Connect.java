
package university.management.system;

import java.sql.*;

public class Connect {
    
    Connection c;
    Statement s;
    Connect (){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "mymysql");
            s = c.createStatement();
        
     } catch (Exception e)
        {
        e.printStackTrace();
         }
    }
}

