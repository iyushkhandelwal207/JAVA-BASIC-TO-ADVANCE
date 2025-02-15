class demo{
	int x,y;
	demo(int p,int q){
		//System.out.println("constructor 1 called");
		x=p;
		y=q;
	}
	demo(){
		x=10;
		y=100;
	}
	demo(int p){
		x=p;
		y=20;
	}
	void fun1(){
		//System.out.println("function 1 called:");
		x=22;
		y=20;
	}
}
class j6{
public static void main(String[] args){
	demo d1=new demo(5,6);
	demo d2=new demo(4,6);
	demo d3=new demo();
	System.out.println(d1.x);
		System.out.println(d1.y);
	
}}