import java.util.*;
class Electronics{}
class Mobile extends Electronics{}
class Laptop extends Electronics{}
class Computer extends Electronics{}

class Flipkart {
public Electronics shopping(int choice){
if(choice==1){return new Mobile();}
else if(choice==2){return new Laptop();}
else if(choice==3){return new Computer();}
else{return null;}
}
}
class Main{
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the response.\n 1.Mobile \n 2.Laptop \n 3.Computer");

	int a1=sc.nextInt();
	Electronics e1=new Flipkart().shopping(a1);
	if(e1 instanceof Mobile){
		
		System.out.println("Mobile is ordered by user.");
	}
	else if(e1 instanceof Laptop){
		
		System.out.println("Laptop is ordered by user.");
	}
	else if(e1 instanceof Computer){
		
		System.out.println("Computer is ordered by user.");
	}
	else{
				System.out.println("Invalid response by user.");

	}
}}

