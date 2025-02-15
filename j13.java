



class j13{
public static void main(String[] args){
	String s=null;
	try{
		System.out.println(s.length());
}
catch(NullPointerException n1){
	System.out.println(n1.getMessage());
}
System.out.println("A");
try{
System.out.println(6/0);
}
catch(ArithmeticException e){
	System.out.println(e.getMessage());
}
System.out.println("B");

}
}