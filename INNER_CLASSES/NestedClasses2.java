class outer{
    int inner=10;
    class inner{
        void display(){
            System.out.println("this is inner display");
    }}}
public class NestedClasses2{
	public static void main(String[] args) {
		outer o1=new outer();						//here outer class object is created
		outer.inner a2 =new outer().new inner();	//here inner class object is created
		outer.inner a3=o1.new inner();				//it is second way of inner class object creation
	    int a6=outer.inner;
	    int a7=o1.inner;
		int a4=o1.inner;						// it is an error.
		System.out.println(a7);
	
	outer.inner a5=a3;							//it is third way of inner class object creation
		a5.display();
	//	outer.inner o8=new outer().inner;
		
		/*
		there are 3 ways for object creation they are:
		1.create object for inner class and outer class
			e.g; outer.inner a1 =new outer().new inner();
		2.create object for inner class and use already created object reference of outer class.
			e.g; outer.inner a2 =o1.new inner();
		3.use the already created object reference for inner class
			e.g; outer.inner a3 =a2; // it is valid but,
				 outer.inner a4=o1.a2;	// it is error due to compiler looks for the 
										// a2 which is in the o1 either it is available 
										// in the o1 or not.
				 
		
		
		*/
	}
}