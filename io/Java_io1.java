import java.io.*;
import java.util.*;
class java_io1
{
	public static void main(String args[])throws IOException
	{
		//new File("anonymous created file").createNewFile();
		File f=new File("C:\\Users\\shaik\\Downloads\\Telegram Desktop\\New folder\\persona.txt");
		boolean f13=f.createNewFile();
		System.out.println(f13);
	//	boolean f12=f.delete();
	//	System.out.println(f12);
		
		File f1=new File("workspace");
		f1.mkdir();
		File f3=new File(f1,"file1");
		f3.createNewFile();
		File f4=new File(f1,"file2");
		f4.createNewFile();
		File f6=new File(f1,"workspace_child1");
		f6.mkdir();
		File f5=new File("workspace");
		File io=new File("io");
		
		String[] all_files_and_folders=f5.list();
		String[] files_in_io=io.list();
		System.out.println(files_in_io);
		System.out.println("files and folders");
		for(int i=0;i<all_files_and_folders.length;i++)
		{
			File f11=new File("workspace",all_files_and_folders[i]);
			
			if(f11.isFile())
			{
				System.out.println("File: "+f11);
			}
			else{System.out.println("Folder: "+f11);}
		}
		f.delete();
		f1.delete();
		f4.delete();
		f3.delete();
		f5.delete();
		f6.delete();
		//System.out.println("contents of file: ");
		//Scanner sc=new Scanner(new File("gani.txt"));
		//System.out.println(sc.hasNextLine()?sc.nextLine():"sorry no contents in your file");
		
	}
}