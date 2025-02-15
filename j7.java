class nokia{
int x,y;
void f1(){
	System.out.println("parent function 1 executed");
}
void f2(){
	System.out.println("parent function 2 executed");
}
nokia(){
	System.out.println("constructor called:parent");
}
}
class nokia2 extends nokia{
	int z;
void f3(){
	System.out.println("child fxn 1 executed:");
}

nokia2(){
	System.out.println("constructor called:child");
}
}


class j7{
public static void main(String[] args){
	nokia2 n1=new nokia2();
	n1.f1();
	n1.f2();
	n1.f3();
}
}