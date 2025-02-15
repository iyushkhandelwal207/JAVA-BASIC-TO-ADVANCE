class j21{
public static void main(String[] args){
	int n=19;
	int prime=1;
for(int i=2;i<n;i++){
if(n%i==0){
	prime=0;
}
}
if(prime==1){
System.out.println("it is prime numbger");
}else{
	System.out.println("it is not prime numbger");
}
}
}