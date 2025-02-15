class j22{
public static void main(String[] args){
int a=122;
int b=a;
int rem;
int rev=0;
while(a>0){
	rem=a%10;
	rev=rev*10+rem;
	a=a/10;
}
if(b==rev){
	System.out.println("palindrome number");
}else{
	System.out.println(" not palindrome number");
}
}
}