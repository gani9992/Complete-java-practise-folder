import java.io.*;
import java.sql.*;

class RetrivingImageFromDatabase2 {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajdb", "root", "");
   
        PreparedStatement pst = con.prepareStatement("select * from images_stored_database;");
	ResultSet rs=pst.executeQuery();
	int count=1;
	while(rs.next())
{
     	FileOutputStream fi = new FileOutputStream(
                "C:\\Users\\shaik\\OneDrive\\Desktop\\javaPrograms\\jdbc\\gani_images_retrived_from_database\\new_image"+count+".jpg");

	byte[] b1=rs.getBytes(1);

	fi.write(b1);
	fi.flush();
	fi.close();
count+=1;
}

	pst.close();
	con.close();
	System.out.println("retrieved successfully!");

    }
}