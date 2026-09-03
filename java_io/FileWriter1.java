import java.io.*;


 class FileWriter123 {
    public static void main(String[] args) throws Exception{
      try(FileWriter fi=new FileWriter("C:/Users/shaik/OneDrive/Desktop/java_io.txt"))
	  {
		  String a1=" hey bro you are awesome...";
		  byte a[]=a1.getBytes();
		 int i=0;
		fi.write(a);
		// fi.close();
	  }
		// fi.close();
		  
    }
}