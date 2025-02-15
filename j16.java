import java.io.*;
class j16
{
public static void main(String[] args) throws IOException
{
	String s1="coding seekho";
	File h1=new File("a.txt");
	FileOutputStream f1=new FileOutputStream(h1);
	char ch[]=s1.toCharArray();
	for(int i=0;i<ch.length;i++){
		f1.write(ch[i]);
	}
	//f1.write('c');
	f1.close();
	//f1.createNewFile();
/*	System.out.println(f1.exists());
	System.out.println(f1.canWrite());
	System.out.println(f1.length());*/
}
}
