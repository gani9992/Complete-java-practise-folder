import java.io.*;
//import java.io.IOException;

 class file2 {
    public static void main(String[] args) throws IOException{
      try(FileOutputStream fi=new FileOutputStream("C:/Users/shaik/OneDrive/Desktop/java_io.txt"))
	  {
		  String si="java is awesome";
		byte a[]=new byte[si.length()];
		for(int i=0;i<si.length()-1;i++)
		{
			a[i]=(byte)si.charAt(i);
		}
		fi.write(a);
		
	  }
		// fi.close();
		  
    }
}