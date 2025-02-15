class area{
static void fun1(){
System.out.println("area1");
}
static void fun2(){
System.out.println("area2");
}
}



class second{
static void fun1(){
System.out.println("a");
}
static void fun2(){
System.out.println("b");
}
public static void main(String[] arge){
System.out.println("hello world");
fun1();
fun2();
area.fun1();
area.fun2();
}
}