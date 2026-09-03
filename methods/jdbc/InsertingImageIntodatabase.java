import java.io.*;
import java.sql.*;

class InsertingImageFromDatabase2 {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajdb", "root", "");
        FileInputStream fi = new FileInputStream(
                "C:\\Users\\shaik\\OneDrive\\Desktop\\javaPrograms\\jdbc\\images\\adhaar_id.png");

        PreparedStatement pst = con.prepareStatement("insert into images_stored_database values (?)");
        pst.setBinaryStream(1, fi);
        int i1 = pst.executeUpdate();
        System.out.println("values inserted successfull!");
    }
}