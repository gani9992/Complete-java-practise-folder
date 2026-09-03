import java.util.Scanner;
import com.zaxxer.hikari.HikariConfig;
import java.sql.*;
import com.zaxxer.hikari.HikariDataSource;

class Hikari
{
public static void main(String args[])throws Exception{
	
	HikariConfig hc=new HikariConfig();
	hc.setJdbcUrl("jdbc:mysql://localhost:3306/ajdb");
	hc.setUsername("root");
	hc.setPassword("");
	HikariDataSource hrs=new HikariDataSource(hc);
	Connection con=hrs.getConnection();
	Statement st=con.createStatement();
	String query="insert into gani11 values(30,'yasin')";
	int rowsEffected=st.executeUpdate(query);
	System.out.println("inserted rows: "+rowsEffected);
	System.out.println(hc.getMaximumPoolSize());
	con.close();
}}