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
class SelectFromTableUsingCallableStatement {
    public static void main(String args[]) throws Exception {
       Class.forName("gani");
	String url = "jdbc:mysql://localhost:3306/ajdb";
        String user = "root";    
        String password = "";     
       Connection con = DriverManager.getConnection(url, user, password);
	
	
	CallableStatement st=con.prepareCall("call 	SelectFromTableUsingJDBC(?,?)");
	st.setInt(1,20);
	st.registerOutParameter(2,Types.VARCHAR);
	
	
	ResultSet rs=st.executeQuery();    
	while(rs.next()){
		System.out.println(rs.getString(1));
	}
    }
}