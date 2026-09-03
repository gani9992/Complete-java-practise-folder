import java.util.*;
class Student
{
	String[] m1=new String[3];
	String a1,a2,a3,a4;
	int i=0;
	 public Student(String a1,String a2,String a3,String a4)
	 {
		 this.a1=a1;
		 this.a2=a2;
		 this.a3=a3;
	 this.a4=a4;}
	 public Student(String a1,String a2,String a3,String a4,String a5)
	 {
		 m1[i]=a2;i++;
		 m1[i]=a3;i++;
		 m1[i]=a4;i++;
		// m1[i]=a5;i++;
		 }
	 public String getSubject(){
		 return a2+"  "+a3+"  "+a4;
	 }
	 public String[] getSubjects()
	 {
		 return m1;
	 }
	 public String toString()
	 {
		 return m1[0]+"  "+m1[1]+"	"+m1[2];
	 }
	 
	 
	
}
	

class Oops6
{
	public static final void main(String[] args)
	{
		Student st=new Student("gani","english","maths","social");
		Student st1=new Student("gani","english","maths","social","science");
		System.out.println(st.getSubject());
		//System.out.println((st1.getSubjects()).toString());
		String l1[]=st1.getSubjects();
		for(String l:l1)
		{
			System.out.print(l+"  ");
		}
		System.out.println();
		System.out.println("third array");
		System.out.println(st1);
	}
}
		