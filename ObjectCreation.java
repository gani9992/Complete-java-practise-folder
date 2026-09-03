class ObjectCreation {
public static void main(String args[]){
	
	gani g1=new gani("gani","12l1");
	gani g2=new gani("yasin","12z0");
	gani g3=new gani("rahman","12k9");
	gani g4=new gani("akbar","12q0");
	g1.display();
	g2.display();
	g3.display();
	g4.display();
	
	
}
}

class gani{
	String name;String id;
	gani(String s,String id){
		this.name=s;
		this.id=id;
	}
	public void display(){
		System.out.println("Employee name is: "+name+", employee id is: "+this.id);
	}
}