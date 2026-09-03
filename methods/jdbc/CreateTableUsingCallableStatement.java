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
class CreateTableUsingCallableStatement {
    public static void main(String args[]) throws Exception {
       Class.forName("gani");
	String url = "jdbc:mysql://localhost:3306/ajdb";
        String user = "root";    
        String password = "";     
        Connection con = DriverManager.getConnection(url, user, password);
	//String query="update gani11 set name='gani_l1S' where name='gani'";
	CallableStatement st=con.prepareCall("call creatingTableUsingJDBC()");
	int rowsEffected=st.executeUpdate();    
	System.out.println("no.of records updated is: "+rowsEffected);

    }
}
