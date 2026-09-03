import static java.lang.System.out;
import java.io.*;

class FindingNOOfCharactersAndWordsAndLinesInAFile{
public static void main(String args[])throws IOException{
	PrintStream g=out;
	PrintStream gani=out;
	FileReader f1=new FileReader("data.txt");
	int f=f1.read();
	g.print(((char)f));
	int line=1,word=1,character=1;
	while(f!=-1){
		if(f=='\n' || f==-1)
		{
			line+=1;
			word+=1;
			
		}
		 if(f==' ')
		{
			word+=1;
			if(f==' '){character+=1;}
		}
		else
		{
			character+=1;
		}		
		f=f1.read();
		g.print((char)f+" ");
	}
	
	gani.println("characters: "+character);
	gani.println("words: "+word);
	gani.println("lines: "+line);

}
}