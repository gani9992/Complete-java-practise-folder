import java.io.*;
//import java.io.IOException;

 class file1 {
    public static void main(String[] args) throws IOException{
      try(FileOutputStream fi=new FileOutputStream("C:/Users/shaik/OneDrive/Desktop/java_io.txt"))
	  {
		  String a1="learn java programming by yourself or atleast do something for yourself...";
		 int i=0;
		 while(i<a1.length())
		 {
			 short b=(short)a1.charAt(i);
			 fi.write(b);
			 i++;
			 
		 }
		// fi.close();
	  }
		// fi.close();
		  
    }
}