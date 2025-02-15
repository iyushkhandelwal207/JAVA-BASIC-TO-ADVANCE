abstract class demo{
	int x,y;
	void function(){
	x=5;
	y=2;
	}
	abstract void function1();
	demo(){
		System.out.println("parent constructor");
}
}
class demo1 extends demo{
	int z;
	//super();
	void function1(){
		System.out.println("hello world");
	}
	demo1(){
		System.out.println("chiled constructor");
}
}
		



class j8{
public static void main(String[] args){
	demo1 m=new demo1();
}
}