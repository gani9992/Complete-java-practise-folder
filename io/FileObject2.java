import java.io.*;
class FileObject2{
	
	public static void main(String args[])throws IOException,ClassNotFoundException{
		
		Person p=new Person();
		FileOutputStream f1=new FileOutputStream("person.gani");
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		o1.writeObject(p);
		o1.flush();
		o1.close();
		System.out.println("serialization completed...");
		/*
		*/		
		FileInputStream f2=new FileInputStream("person.gani");
		ObjectInputStream o2=new ObjectInputStream(f2);
		Object obj=o2.readObject();
		Person p1=(Person)obj;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.id);
		System.out.println("accNo is: "+p1.accNo);
		
	}
}
		