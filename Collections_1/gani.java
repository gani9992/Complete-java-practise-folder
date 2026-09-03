

import java.util.*;
 public class gani
{
	public static void main(String[] args) {
		gani1 l1=new gani1(34);
		gani1 l2=new gani1(10);
		gani1 l3=new gani1(340);
		gani1 l4=new gani1(100);
		gani1 l5=new gani1(304);
		gani1 l6=new gani1(10);
		shaik s=new shaik();
		TreeSet<gani1> l11=new TreeSet<gani1>(s);
		l11.add(l1);
		l11.add(l2);
		l11.add(l3);
		l11.add(l4);
		l11.add(l5);
		l11.add(l6);
		System.out.println(l11);
	}
}

class gani1 {
    
    int a;
    gani1(int a){
        this.a=a;
    }
    public String toString(){
        return a+"";
    }
  /*  public int compare(gani1 a1){
        return this.a-a1.a;
    }*/
}

class shaik implements Comparator<gani1>{
	
	@Override
	public int compare(gani1 g1,gani1 g2){
		return g2.a-g1.a; 
	}
}