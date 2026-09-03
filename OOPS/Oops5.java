import java.util.*;
class Student{
	 String subject[]=new String[3];	// must resolve this error.
	 int i=0;
	 public Student(String subject)
	 {
	 this.subject[i]=subject;
	 i++;
	 }
	 public String[] toString1()
	 {
		return subject;
	 }
	 
	 
	
}
	

class Oops5
{
	public static final void main(String[] args)
	{
		Student[] st=new Student[3];
		st[0]=new Student("maths");
		st[1]=new Student("ds");
		st[2]=new Student("machine learning");
		st[2].toString1();
		String [] m1=st[2].toString1();
		for(int i=0;i<m1.length;i++)
		{
			System.out.println(m1[i]);
		}
		System.out.println(m1.toString());
		//System.out.println(st.toString(toString1()));
		//System.out.println(st[0].toString());
	}
}
		