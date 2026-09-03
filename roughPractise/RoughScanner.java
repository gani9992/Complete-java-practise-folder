import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RoughScanner {
    public static void main(String... args) {
        try {
            File file = new File("C:\\Users\\shaik\\OneDrive\\Desktop\\java_io1.txt");
            Scanner sc = new Scanner(file);
            System.out.println(sc.nextLine());
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
