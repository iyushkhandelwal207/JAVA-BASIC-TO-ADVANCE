//multithreading-we can implement this by two ways -1 using runable interface 2.using thread class
//here we use runable interface in which a fxn run is already abstract so we complete do it in its derived child.
//import java.util.*;
class process1 implements Runnable {
public	void run(){
		int i;
		for(i=1;i<10;i++){
			System.out.println("process1:"+i);
}
	}
}

class process2 implements Runnable{
	public void run(){
		int i;
		for(i=1;i<10;i++){
			System.out.println("process2:"+i);
}
	}
}



class j10{
public static void main(String[] args){
//S//ystem.out.println("jai mata di:");
process1 p1=new process1();
process2 p2=new process2();
Thread t1=new Thread(p1);
Thread t2=new Thread(p2);
t1.start();
t2.start();

}
}