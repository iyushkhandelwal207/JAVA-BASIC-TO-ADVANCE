import java.util.*;
class j19{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number to check prime number or not:");
int n=sc.nextInt();
for(int i=2;i<n;i++){
	if(n%i!=0){
		System.out.println("this is prime number"); 
	}
}
}
}