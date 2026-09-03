import static java.lang.System.out;
import java.io.*;

class Sample{
public static void main(String args[])throws IOException{
	PrintStream g=out;
	PrintStream gani=out;
	FileReader f1=new FileReader("data1.txt.txt");
	BufferedReader b1=new BufferedReader(f1);
	FileReader f2=new FileReader("data2.txt.txt");
	FileWriter f3=new FileWriter("data3.txt");
	String f=b1.readLine();
	String h1="",h2="";
	while(f!=null){
		//gani.print((char)f);		
		f3.write(f);
		//h1+=(char)f;
		f=b1.readLine();
				
	}
	int ff=f2.read();
	while(ff!=-1){
		//gani.print((char)ff);
		
		f3.write(ff);
		h2+=(char)ff;
		ff=f2.read();
		
	}
	f3.flush();
	System.out.println("completed data 1 file...");
	/*	
	gani.println(h1);
	gani.println(h2);
	String s1[]=h1.split(" ");
	String s2[]=h2.split(" ");
	int count=0;
	
	for(int i=0;i<s1.length;i++){
		for(int j=0;j<s2.length;j++){
			if(s1[i].equals(s2[j])){
				gani.println(s1[i]);count+=1;
			}
		}
	}
	gani.println("total count is: "+count);
	*/
	}
	}
		