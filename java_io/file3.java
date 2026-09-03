import java.io.*;
//import java.io.IOException;

 class file3 {
    public static void main(String[] args) throws IOException{
      try(FileInputStream fi=new FileInputStream("C:/Users/shaik/OneDrive/Desktop/java_io.txt"))
	  {

		byte a[]=new byte[fi.available()];
		fi.read(a);
		String s2=new String(a);
		System.out.println("this is the data in your file");
		System.out.println(s2);
		
	  }
		// fi.close();
		  
    }
}