

import java.util.*;
 public class HashMap1
{
	public static void main(String[] args) {
		
		HashMap l1=new HashMap();
		l1.put(10,"Gani");
		l1.put(11,"Yasin");
		l1.put(12,"Rahman");
		l1.put(13,"Basha");
		l1.put(14,"Sameer");
		l1.put(15,"Jairuddin");
		System.out.println("the value which is retrieved is: "+l1.containsKey(10));
		l1.clear();

		System.out.println("the value which  isEmpty is: "+l1.isEmpty());
		System.out.println(l1);
	}
}

