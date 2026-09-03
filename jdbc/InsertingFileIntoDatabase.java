import java.io.*;
import java.sql.*;

class InsertingFileIntoDatabase {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajdb", "root", "");
   
        PreparedStatement pst = con.prepareStatement("insert into filedatabase values(?)");
	FileInputStream fi=new FileInputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\javaPrograms\\jdbc\\Hikari.java");
	//pst.setBinaryStream(1,fi);
	// now we can use the setClob(1,fi);
pst.setClob(1,fi);
	int u1=pst.executeUpdate();
	System.out.println("inserted successfully!");
    }
}