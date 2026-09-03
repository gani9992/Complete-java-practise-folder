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
class SelectFromTableUsingStatement {
    public static void main(String args[]) throws Exception {
       Class.forName("gani");
	String url = "jdbc:mysql://localhost:3306/ajdb";
        String user = "root";    
        String password = "";     
        Connection con = DriverManager.getConnection(url, user, password);

	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	/*
	String query="ALTER TABLE gani11 ADD PRIMARY KEY (id);";
	int a=st.executeUpdate(query);
	System.out.println("updated values: "+a);
	
	
	ResultSet rs=st.executeQuery("select * from gani11");
	rs.absolute(1);
	rs.updateInt(1,5000);
	rs.updateRow();
	
	//while(rs.next()){
		System.out.println(rs.getInt("id")+"  "+rs.getString("name"));
	//}
	*/
    }
}
