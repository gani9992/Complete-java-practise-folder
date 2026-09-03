import java.sql.*;
import javax.sql.rowset.*;
class JdbcRowSet1 {
    public static void main(String arsg[]) throws SQLException {
       JdbcRowSet r1=RowSetProvider.newFactory().createJdbcRowSet();
	   r1.setUrl("jdbc:mysql://localhost:3306/ajdb");
	   r1.setUsername("root");
	   r1.setPassword("");
	   r1.setCommand("select * from gani11");
	   r1.execute();
	   while(r1.next()){
		   
		   System.out.println(r1.getInt(1));
	   }
	   
    }
}