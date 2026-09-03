import java.sql.*;
import com.mysql.cj.jdbc.Driver;

class Advjava1 {
    public static void main(String args[]) throws Exception {
       
        Driver d = new Driver();
        DriverManager.registerDriver(d);

        // Correct JDBC URL
        String url = "jdbc:mysql://localhost:3306/ajdb";
        String user = "root";    
        String password = "";     

        Connection con = DriverManager.getConnection(url, user, password);
	Statement st=con.createStatement();
	boolean rowsEffected=st.execute("create table gani11(id int, name varchar(20));");        
	System.out.println("records inserted"+rowsEffected);


    }
}
