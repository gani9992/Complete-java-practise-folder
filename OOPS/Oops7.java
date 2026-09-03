import java.util.*;
class Student
{
	String name,sname;
	public Student(String name,String sname){
	this.name=name;
	this.sname=sname;
	}
	public String getSubjects()
	{
	
	return "subject name is: "+sname;
}
	
}
class Oops7
{
	public static final void main(String[] args)
	{
		Student[] st=new Student[2];
		st[0]=new Student("gani","maths");
		st[1]=new Student("yasin","ds");
		for(Student st1:st)
		{
		System.out.println(st1.getSubjects());
		}
		
	}
}
		