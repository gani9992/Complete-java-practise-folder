import static java.lang.System.out;
import java.io.*;

class FindingNOOfCharactersAndWordsAndLinesInAFile{
public static void main(String args[])throws IOException{
	PrintStream g=out;
	PrintStream gani=out;
	FileReader f1=new FileReader("data.txt");
	int f=f1.read();
	g.println(((char)f));

}
}