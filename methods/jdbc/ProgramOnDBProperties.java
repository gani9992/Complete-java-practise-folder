import java.util.Scanner;
import com.zaxxer.hikari.HikariConfig;
import java.sql.*;
import com.zaxxer.hikari.HikariDataSource;
import java.util.Properties;
import java.io.FileInputStream;

class ProgramOnDBProperties {

	public static void main(String args[]) throws Exception {
	//	FileInputStream f = new FileInputStream("db.properties");
		FileInputStream f = new FileInputStream("C:/Users/shaik/OneDrive/Desktop/javaPrograms/jdbc/db.properties");

		Properties p = new Properties();
		p.load(f);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		HikariConfig hc = new HikariConfig();
		System.out.println(hc);
	/*	
		for (String key : p.stringPropertyNames()) {
		System.out.println(key + " = " + p.getProperty(key));
		}

		System.out.println("URL: " + url); 
		System.out.println("Username: " + un);
		System.out.println("Password: " + pwd);
		
		
		hc.setJdbcUrl(url);
		hc.setUsername(un);
		hc.setPassword(pwd);
		
		HikariDataSource hrs = new HikariDataSource(hc);
		Connection con = hrs.getConnection();
		Statement st = con.createStatement();
		String query = "insert into gani11 values(70,'Manikantaq2')";
		int rowsEffected = st.executeUpdate(query);
		System.out.println("inserted rows: " + rowsEffected);
		System.out.println(hc.getMaximumPoolSize());
		con.close();
		*/
	}
}