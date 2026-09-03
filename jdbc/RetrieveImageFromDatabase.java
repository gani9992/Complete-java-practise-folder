import java.sql.*;
import java.io.*;
class RetrieveImageFromDatabase{

public static void main(String args[])throws Exception{

FileOutputStream fi=new FileOutputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\javaPrograms\\jdbc\\gani_images_retrived_from_database\\new.jpg");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajdb","root","");
PreparedStatement st=con.prepareStatement("select image from images_stored_database");

ResultSet  rs=st.executeQuery();
rs.next();
byte [] b1=rs.getBytes(1);
// note: here image -> it is name of the column in the database.
fi.write(b1);
st.close();
con.close();
fi.close();
}
}