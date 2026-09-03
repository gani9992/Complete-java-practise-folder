import java.sql.*;
import com.mysql.cj.jdbc.Driver;

class gani {

        static {
                try {
                        Driver d = new Driver();

                        DriverManager.registerDriver(d);
                } catch (Exception e) {
                }

        }
}

class WithoutUsingTheClassDotForName {
        public static void main(String args[]) throws Exception {
                Class.forName("gani");
                String url = "jdbc:mysql://localhost:3306/ajdb";
                String user = "root";
                String password = "";
                Connection con = DriverManager.getConnection(url, user, password);

                Statement st = con.createStatement();
                int rowsEffected = st.executeUpdate("insert into gani11 values(2,'g')");
                System.out.println("no.of records inserted is: " + rowsEffected);

        }
}
