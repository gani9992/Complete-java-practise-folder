import java.io.FileReader;
import java.io.IOException;

public class Exception2 {
    public static void main(String[] args) {
       // try {
            FileReader file = new FileReader("data.txt"); // may throw IOException
       // } 
		/*
		catch (IOException e) {
            e.printStackTrace();
        }
		*/
    }
}