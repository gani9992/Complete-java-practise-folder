interface it1{
	int a=10;
	 void display();
}
class it2 implements it1{
	public void display(){
		System.out.println("this is the it2 class");
	}
}

class Interfac1
{
public static void main(String args[])
{
	it2 it=new it2();
	it.display();
}
}