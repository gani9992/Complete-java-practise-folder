import java.util.Scanner;
import com.zaxxer.hikari.HikariConfig;

class Hikari{
public static void main(String args[]){
	
	HikariConfig hc=new HikariConfig();
	hc.setJdbcUrl="jdbc:mysql://localhost:3306/ajdb";
	hc.setUsername="root";
	hc.setPassword="";
	HikariDataSource hrs=new HikariDataSource(hc);
	Connection con=hrs.getConnection();
	Statement st=con.createStatement();
	String query="insert into gani11 values(20,'rahman')";
	int rowsEffected=st.executeUpdate(query);
	System.out.println("inserted rows: "+rowsEffected);
	con.close();
}}