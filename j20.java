class j20{
public static void main(String[] args){
int a=0; 
int b=1;
for(int i=2;i<=30;i++){
int sum=a+b;
a=b;
b=sum;
System.out.println("the fibbbonacci :"+sum);
}
}
}