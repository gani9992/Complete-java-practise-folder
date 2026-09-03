import java.sql.*;
import java.util.*;
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
class RoughSelect {
    public static void main(String args[]) throws Exception {
       Class.forName("gani");
	String url = "jdbc:mysql://localhost:3306/ajdb";
        String user = "root";    
        String password = "";     
        Connection con = DriverManager.getConnection(url, user, password);
	StringBuilder query=new StringBuilder("select * from gani11");
	query.append(" where id=?");

	
	PreparedStatement st=con.prepareStatement(String.valueOf(query));
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value: ");
	int a=sc.nextInt();
	st.setInt(1,a);
	ResultSet rs=st.executeQuery();
	while(rs.next()){
		
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));
	}
    }
}
