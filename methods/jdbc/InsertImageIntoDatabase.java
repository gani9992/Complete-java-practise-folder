import java.sql.*;
import java.io.*;
class InsertImageIntoDatabase{

public static void main(String args[])throws Exception{
FileInputStream fi=new FileInputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\javaPrograms\\jdbc\\images\\leetcode.png");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajdb","root","");
PreparedStatement st=con.prepareStatement("insert into images_stored_database values(?)");
st.setBinaryStream(1,fi);
int rowsEffected=st.executeUpdate();
System.out.println("no.of rows inserted: "+rowsEffected);
st.close();
con.close();
fi.close();
}
}