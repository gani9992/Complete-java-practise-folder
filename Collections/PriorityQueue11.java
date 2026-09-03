import java.util.*;
 class l1 implements Comparator<Integer>{
	
public	int compare(Integer a,Integer b){
		if(a>b){return 1;}
		if(a<b){return -1;}
		else{ return 0;}
		
}}
class PriorityQueue1{

public static void main(String args[])
{
PriorityQueue <Integer> pl=new PriorityQueue<>(new l1());
pl.add(20);
pl.add(10);
pl.add(30);
pl.add(5);
pl.add(15);
pl.add(3);
pl.forEach(PriorityQueue1::gani);
//pl.forEach((x)->{System.out.println(x);});
System.out.println(pl);

}
 static void gani(Integer aa)
 {
System.out.println(aa);
}
}