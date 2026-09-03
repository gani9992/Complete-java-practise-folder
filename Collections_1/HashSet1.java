
import java.util.*;
class HashSet1{
	
	public static void main(String arga[]){
		Student s1=new Student(1000);
		Student s2=new Student(290);
		Student s3=new Student(30);	
		TreeSet<Student> e1=new TreeSet<>();
		e1.add(s1);
		e1.add(s2);
		e1.add(s3);		
		for(Object c1:e1){
			System.out.println(c1);
		}}}

class Student implements Comparable<Student>{
	
	int a;
	Student(int a){
		System.out.println("this is something for me: "+a);
		this.a=a;
	}
	public String toString(){
		return "id: "+a;
	}
	public int compareTo(Student s1){
		System.out.println("this is something for me"+this.a);
		return this.a-s1.a;
	}
}