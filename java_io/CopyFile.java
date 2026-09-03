import java.io.*;
import java.util.*;


 class CopyFile {
    public static void main(String[] args) throws IOException{
		String a="";
	try(FileInputStream fi1=new FileInputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\java_io.txt"))
	  {
	    System.out.println("This is content in java_io file content...");
		Byte b[]=new Byte((byte)fi1.available());	
		fi1.read(b);
		String b1=new String(b);
		System.out.println("\""+b1+"\"");
		a+=b1;
		
		
	  }	
		
      try(FileOutputStream fi2=new FileOutputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\java_io1.txt"))
	  {
	    System.out.println("This is content which is written to java_io1 file content...");
		String a1=a.toUpperCase();
		byte b1[]=a1.getBytes();
		fi2.write(b1);		
	  } 
			  
    }
}