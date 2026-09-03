class Student{
	private static float length,breadth;
	static float area()
	{
		return length*breadth;
	}
	//static float area1(){
	//	return getlength()*getBreadth();
	//}
	
	float getlength(){
		return length;
	}
	float getBreadth(){
		return breadth;
	}
	void setLength(float l)
	{
		length=l;
	}
	void setBreadth(int l)
	{
		breadth=l;
	}
}
	

class Oops3
{
	public static void main(String args[])
	{
		Student st=new Student();
		st.setLength(-10);
		st.setBreadth('A');
		//st.breadth=10;	// this is not possible as they are private.
		System.out.println(Student.area());
		System.out.println(st.area());
		System.out.println(st.area()); // this  is not within the class so it will throw the error.
		//System.out.println(Student.area1());
	
	}
}
		