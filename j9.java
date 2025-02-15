interface i1{
	int x=6;
	void f1();
	static void f2(){
		System.out.println("jai mata di");
	}
	
}
interface i2 extends i1{
int y=2;
void f3();
static void f2(){
		System.out.println("jai mata di i di ddi ");
	}
}
class c1 implements i2{
	public void f1(){}
	public void f3(){}

}
class j9{
public static void main(String[] args){
	i2.f2();
	c1 c=new c1();
	//System.out.println(c.f2);
}
} 