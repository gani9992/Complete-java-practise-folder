import java.io.*;
class FileObject{
	
	public static void main(String args[])throws IOException,ClassNotFoundException{
		/*
		Person p=new Person();
		FileOutputStream f1=new FileOutputStream("person.ser");
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		o1.writeObject(p);
		o1.flush();
		o1.close();
		
	
		/*
		*/
		FileInputStream f2=new FileInputStream("person.ser");
		ObjectInputStream o2=new ObjectInputStream(f2);
		Object obj=o2.readObject();
		Person p1=(Person)obj;
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.id);
		System.out.println(p1.age);
		p1.hello();
		o2.close();
		
				
	}
	
}