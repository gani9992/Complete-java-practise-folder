import java.sql.*;
import com.mysql.cj.jdbc.Driver;
class gani{
static {
	try{
        Driver d = new Driver();
        DriverManager.registerDriver(d);
	}
	catch(Exception e){}

}
}
class DeleteFromTableUsingStatement {
    public static void main(String args[]) throws Exception {
       Class.forName("gani");
	String url = "jdbc:mysql://localhost:3306/ajdb";
        String user = "root";    
        String password = "";     
        Connection con = DriverManager.getConnection(url, user, password);

	Statement st=con.createStatement();
	int rowsEffected=st.executeUpdate("delete from gani11 where id=2");    
	System.out.println("no.of records updated is: "+rowsEffected);

    }
}
