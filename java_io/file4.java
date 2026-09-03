import java.io.*;
import java.util.*;
//import java.io.IOException;

 class file4 {
    public static void main(String[] args) throws IOException{
      try(FileOutputStream fi2=new FileOutputStream(r"C:\Users\shaik\OneDrive\Desktop\java_io.txt"))
	  {
/*
		byte a[]=new byte[fi1.available()];
		fi1.read(a);
		String s2=new String(a);
		System.out.println("this is the data in your file");
		System.out.println(s2);
		
		System.out.println("enter something");
		Scanner sc=new Scanner(System.in);
		
		
		String a1=sc.nextLine();
		sc.nextLine();
		*/
		String a1="this is something bro then what is thought ..";
		byte b1[]=a1.getBytes();
		fi2.write(b1);
		
		
	  }
		// fi.close();
		  
    }
}