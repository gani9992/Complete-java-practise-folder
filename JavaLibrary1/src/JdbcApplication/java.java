/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcApplication;

/**
 *
 * @author Abdul Gani
 */
import java.sql.*;
public class java {
    public static void main(String args[])throws Exception{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajdb","root","");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from gani11");
        while(rs.next()){
            System.out.println(rs.getInt(1)+ " "+rs.getString(2));
        }
        st.close();
        con.close();
    }
    
}
