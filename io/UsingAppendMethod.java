import java.io.*;
public class UsingAppendMethod{
public static void main(String ags[])throws Exception{
FileWriter fi=new FileWriter("gani.txt");
FileReader fr=new FileReader("gani.txt");
while(fr.read()!=-1){fr.read();}
fi.append("hello gec..!!!");
fi.flush();
}
}