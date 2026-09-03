import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
class LogicalPrograms2{
public static void main(String arsg[])throws Exception{
FileReader f=new FileReader("gani.txt");
BufferedReader br=new BufferedReader(f);
String i=br.readLine();
while(i!=null){
System.out.println(i);
i=br.readLine();

}
}
}