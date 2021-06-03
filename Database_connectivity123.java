/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database._connectivity123;
import java.sql.*;
/**
 *
 * @author Chiggy
 */
public class Database_connectivity123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String sql = "select student_name,value,entry_date from attendence where value = 'P' ";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            try
            {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?zeroDateTimeBehavior=convertToNull","root","root");
                Statement smt = con.createStatement();
                ResultSet rs = smt.executeQuery(sql);
              
                while(rs.next())
                {
                  
                String firstdata = rs.getString("student_name");
                String value_data = rs.getString("value");
                String entry_data = rs.getString("entry_date");
                System.out.println(firstdata);
                System.out.println(value_data);
                System.out.println(entry_data);
                }
              
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e )
        {
            
        }
    }
    
}
