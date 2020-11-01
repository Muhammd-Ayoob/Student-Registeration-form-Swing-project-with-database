/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregisterationform;
import java.sql.*;
/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class JdbcConnection {
    public static Connection getConnection()
    {
         Connection con=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registeration_form", "root", "admin");
           //System.out.println("CONGRATULATIONS DATABAE Succefully Connected");
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
   return con;
    }
}
