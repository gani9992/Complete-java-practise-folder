import java.io.*;
//import java.io.IOException;

 class file5 {
    public static void main(String[] args) throws IOException{
      try(FileInputStream fi=new FileInputStream("C:/Users/shaik/OneDrive/Desktop/java_io.txt"))
	  {

		int x;
		while((x=fi.read())!=-1){
		System.out.print((char)x);
		}
		
	  }
		// fi.close();
		  
    }
}