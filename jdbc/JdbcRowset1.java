import java.util.Scanner;
import javax.sql.*;
import java.sql.*;
import javax.sql.rowset.*;


class JdbcRowset1 {

	public static void main(String args[]) throws Exception {
	JdbcRowSet jc = RowSetProvider. newFactory(). createJdbcRowSet();
	jc.setUrl("jdbc:mysql://localhost:3306/ajdb");
	jc.setUsername("root");
	jc.setPassword("");
	jc.setCommand("select * from gani11");
	jc.execute();
	while(jc.next())
	{
	System.out.println(jc.getInt(1)+"  "+jc.getString(2));
	}
	}
}