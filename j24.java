class j24{
public static void main(String[] args){
int a=153;
int rem;
int real=0;
int b=a;
while(a>0){
rem=a%10;
real=real+(rem*rem*rem);
a=a/10;
}
if(real==b){
System.out.println("it is a armstrong number:");
}else{
System.out.println("it is not a armstrong number");
}


}}