import java.util.*;
public class Treeset1{
public static void main(String args[])
{
shaik s=new shaik();
//TreeSet<Integer> l1=new TreeSet<>(s);
TreeSet<Integer> l1=new TreeSet<>();

l1.add(10);
l1.add(100);
l1.add(30);
l1.add(1000);
l1.add(40);
l1.add(600);
l1.add(90);
l1.add(1);
System.out.println(l1);

}
}


// now just see ways we can it's order like this
class gani implements Comparable<Integer>{
int l1;
public gani(Integer l1){
this.l1=l1;
}
@Override
public int compareTo(Integer l1){
return +1;
}
}



// from here trying to implement such that all elements are sorted in decreasing order.
class shaik implements Comparator<Integer>
{
@Override
public int compare(Integer l1,Integer l2){
return +1;
}
}