class Student{
	String name,rollno;
	int marks1,marks2,marks3;
	public int total()
	{
return marks1+marks2+marks3;
	}
public int average(){
	return (marks1+marks2+marks3)/3;
}
 public String toString(int a){
return "name: "+name+"\n"+"rollno: "+rollno+"\n"+"value of a is: "+a;}}
	

class Oops2
{
	public static void main(String args[])
	{
		Student st=new Student();
		st.name="gani";st.marks1=41;st.marks2=49;st.marks3=34;st.rollno="23481a12L1";
		System.out.println(st.total());
		
		System.out.println(st.average());
		
		System.out.println(st.toString(20));
	}
}
		