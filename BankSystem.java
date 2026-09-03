import java.util.*;
import java.io.*;
import java.lang.reflect.*;
class InsufficientBalanceException extends RuntimeException{
public InsufficientBalanceException(String msg){
super(msg);
}
}
class gani{

FileWriter fw=new FileWriter("gani.txt");
BufferedWriter bw=new BufferedWriter(fw);
FileReader fr=new FileReader("gani.txt");
BufferedReader bw=new BufferedReader(fr);

public static void deposit(int amut){
int cash=Integer.paserInt(bw.readLine());
cash+=amut;
bw.write(cash);
 System.out.println("deposit successful...\n\n\n");}

public static void withdraw(int amut){
if(amut>cash)
{
throw new InsufficientBalanceException("balance is not sufficient to withdraw please better to check your balance...\n\n\n");
}
else
{
cash=Integer.paseInt(fr.readLine());
cash-=amut;
}
System.out.println("deposit successful...\n\n\n");
}

public static void  balanceDisplay(){
System.out.println("Your amount in the bank is: "+cash+"\n\n\n");
}

}
class BankSystem{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Select the below options....");
int i=0;
int selectOption=0;

while(selectOption!=4){
System.out.println("1.deposit...");
System.out.println("2.withdraw...");
System.out.println("3.check balance");
System.out.println("4.exit");
selectOption=sc.nextInt();


if(selectOption==1){
System.out.println("Enter the amout that you want to deposit...");
int amt=sc.nextInt();
gani.deposit(amt);
}
else if(selectOption==2){
System.out.println("Enter the amout that you want to withdraw...");
int amt=sc.nextInt();
gani.withdraw(amt);
}
else if(selectOption==3){
gani.balanceDisplay();
}
else{
System.out.println("Thank you...");
break;
}}
}
}