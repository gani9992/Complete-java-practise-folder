import java.util.*;
class SecondMaximumElement
{
public static void main(String args[])
{
int a[]={100,20,30,50,60,40};

int max1,max2;max1=max2=0;

for(int i=0;i<a.length;i++)
{
	//System.out.print(a[i]+"  ");
	if(max1<a[i])
	{
		max2=max1;
		max1=a[i];
	}
	else if(max2<a[i]){
		max2=a[i];
}}
	System.out.println("The first largest element is: "+max1);
	System.out.println("The second largest element is: "+max2);



}
}