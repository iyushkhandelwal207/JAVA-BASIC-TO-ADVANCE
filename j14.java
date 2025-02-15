//introduction to gui here we achieve this by using awt and using swing 
//container -frame , panel 
//components-label ,list etc.
//
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class j14 extends JFrame{
		JLabel l1,l2,l3,l4;
		JTextField t1;
		JPasswordField t2;
		JButton b1,b2,b3;
	j14(String s1){
		super(s1);
	}
	j14(){
	}
	void setComponents(){
	/*	JLabel j1=new JLabel("WELCOME");
		JTextField t1=new JTextField();
		setLayout(null);
		j1.setBounds(200,200,100,30);
		t1.setBounds(200,200,100,30); 
		add(j1);
		add(t1);*/
		Cursor c1=new Cursor(Cursor.WAIT_CURSOR);//HE WE CAN USE HAND CURSOR ALSO
		Font f1=new Font("times new roman",Font.BOLD,28);
		Font f2=new Font("callibri",Font.ITALIC,22);
		l1=new JLabel("welcome to coding seekho institute");
		l2=new JLabel("username");
		l3=new JLabel("password");
		l4=new JLabel();
		t1=new JTextField();
		t2=new JPasswordField();
		b1=new JButton("Login");
		b2=new JButton("Clear");
		b3=new JButton("add");
		b1.setCursor(c1);
		l1.setFont(f1);
		l3.setFont(f2);
		l1.setForeground(Color.RED);
		l3.setForeground(Color.BLUE);
		setLayout(null);
		b1.setBackground(Color.RED);
		b1.setBackground(Color.RED);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		l1.setBounds(100,50,300,30);
		l2.setBounds(100,200,100,30);
		l3.setBounds(100,350,100,30);
		l4.setBounds(100,550,100,30);
		t1.setBounds(350,200,100,30);
		t2.setBounds(350,350,100,30);
		b1.setBounds(200,450,100,30);
		b2.setBounds(400,450,100,30);
		b3.setBounds(500,550,100,30);
		b1.addActionListener(new log());
		b2.addActionListener(new clear());
		b3.addActionListener(new add());
		l1.addMouseListener(new MouseL());
		
		
	}
	class MouseL implements MouseListener{
		void f1(){};
	public void mouseExited(MouseEvent e1){
	}
	public void  mouseEntered(MouseEvent e1){
	}
	public void mouseReleased(MouseEvent e1){
	}
	public void mousePressed(MouseEvent e1){
	}
	public void mouseClicked(MouseEvent e1){
		
	}
	}
	
public static void main(String[] args){
	/*JFrame j1=new JFrame("welcome to facebook");
	j1.setSize(500,500);
	j1.setVisible(true);
	j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
	j14 p=new j14("welcome to coding seekho");
	p.setVisible(true);
	p.setSize(700,700);
	p.setComponents();
	p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
class log implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String s1=t1.getText();
		String s2=t2.getText();
		if(s1.equals("coding")&&s2.equals("seekho")){
			l4.setText("login Successful");
		}else{
			l4.setText("login unsuccessful");
		}
}
}
class clear implements ActionListener{
	public void actionPerformed(ActionEvent e){
		t1.setText("");
		t2.setText("");
		}
}

class add implements ActionListener{
	public void actionPerformed(ActionEvent e){
		try{
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t1.getText());
		int c=a+b;
		l4.setText("addition:"+c);
		}
		catch(Exception e1){
			
		}
		
		}
}
}