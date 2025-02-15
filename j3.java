class nokia{
	private int mic;
	private int cam;
	void setvalue(){
mic=2;
cam=5;		
}
     void display(){
	System.out.println(mic);
	System.out.println(cam);
}
}


class j3{
	public static void main(String[] args){
		nokia n1=new nokia();
		n1.setvalue();
		n1.display();
		nokia n2=new nokia();
		n2.display();
	}
}