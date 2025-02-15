/*
thread state-new thread, runnable , not runnable, dead 
new thread-when new objecr is created
in this we can only have two fxn start and stop 
if we use other fxn then these two then we got illegal thread exception */
//thread priority-set priority and get priority 
import java.util.*;
class account{
	int bal;
	account(int b){
		bal=b;
}
boolean issufficient(int w){
	if(w==bal||w>bal){
		return false;
}else{
	return true;
}
}
void withdraw(int amt){
bal=bal-amt;
System.out.println("Transaction successful:");
System.out.println("current balance:"+bal);
}
}
class customer implements Runnable{
	account a1;
		customer(account a2){
			a1=a2;
		}
		public void run(){
			Scanner sc=new Scanner(System.in);
			synchronized(a1){
			System.out.println("enter amount to withdraw:");
			//Scanner sc=new Scanner(System.in);
			int data=sc.nextInt();
			if(a1.issufficient(data)){
				a1.withdraw(data);
			}
			else{
				System.out.println("insufficient balance:");
			}
			}
		}
} 
class j12{
public static void main(String[] args){
	int balance;
	//Scanner s1=new Scanner(System.in);
	account a=new account(5000);
	customer c=new customer(a);
	customer c2=new customer(a);
	Thread t1=new Thread(c);
	Thread t2=new Thread(c2);
	t1.start();
	t2.start();
}
}