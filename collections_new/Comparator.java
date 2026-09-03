import java.util.*;
class Student implements Comparable<Student>{
	
	public String name;
	public int age;
	
	Student(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		
		return "age is: "+this.age;
	}
	
	public int hashCode(){
		return 0;
	 }
	 public boolean equals(Object obj){
		 Student s1=(Student) obj;
		 //return false;--> used to return all the elements without even comparing
		 // return true; --> used to return only one element and remaining will not be stored in set.
		 //return this.age==s1.age;
		 return true;
	 }
	 @Override
	 public int compareTo(Student s1){
		 return this.age-s1.age;
	 }
		 
	
}
class Comparator1{
	
	 
	public static void main(String args[]){
		//LinkedHashSet<Student> l1=new LinkedHashSet<>();
		 TreeSet<Student> l1=new TreeSet<>();
		Student a1=new Student(20);
		Student a2=new Student(30);
		Student a3=new Student(300);
		Student a4=new Student(20);	
		Student a5=new Student(900);
		l1.add(a1);
		l1.add(a2 );
		l1.add(a3 );
		l1.add(a4 );
		l1.add(a5 );
		System.out.println("only one element will be printed...");
		System.out.println(l1);
		
	}
	
}