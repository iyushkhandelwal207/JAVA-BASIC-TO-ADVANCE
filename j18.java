import java.util.*;
import java.math.*;
class j18{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number to check about armstrong");
int n=sc.nextInt();
int remainder;
int m=n;
int l=n;
double sum=0;
int digit=0;
while(l>0){
	digit++;
	l=l/10;
}
while(n>0){
remainder=n%10;
sum=sum+Math.pow(remainder,digit);
n=n/10;
}
if(m==sum){
System.out.println("this is armstrong");
}
else{
	System.out.println("this is not armstrong:");
}
}
}