import java.io.*;
import java.util.*;
class java_io1
{
	public static void main(String args[])throws IOException
	{
		FileReader f=new FileReader("data.txt");
		int i=f.read();
		int count=0;
		while(true)
		{
			if(count==50)
			{
				
				break;
			}
			else
			{
				if(f.read()==-1)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print((char)i);
				i=f.read();
				}
				count++;
			}
			
		}
		/*
	FileWriter f1=new FileWriter("data.txt");
	f1.write("hello world\n");
	
	f1.write("hello world\n");
	f1.write("king of the world");
	f1.flush();
		*/
	}
}