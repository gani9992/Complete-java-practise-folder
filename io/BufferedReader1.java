import java.util.*;
import java.io.*;
import java.lang.reflect.*;

class Main{
public static void main(String args[])throws Exception{
FileWriter fi=new FileWriter("hello.txt");
BufferedWriter bw=new BufferedWriter(fi);
bw.newLine();
//bw.flush();
/*
FileReader fr=new FileReader("hello.txt");
BufferedReader br=new BufferedReader(fr);
String a1=br.readLine();
while(a1!=null){
System.out.println(a1);
a1=br.readLine();
}
*/

}
}