// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class UpCasting
{
    public static void main(String[] args) {
		
		Parent p1=new child();
		Parent p2=(Parent)new child();
		child c1=new child();
		Parent p4=c1;
		Parent p5=(Parent) c1;
		//child p3=(child)p1;
		/*Parent p1=new Parent();
		child p2=new child();
		Parent p3=new child();
		Parent p4=p2;
		child c5=p4;
		p4.display();
		//p1.display();
		*/
		//child c1=new child();
		System.out.println(p2.x);
		c1.display();
	
		}}
		
		class Parent{
			int x=10;
		static void display(){System.out.println("parent display");}}
		class child extends Parent{
			//int x=20;
		
		}