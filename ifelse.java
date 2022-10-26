import java.io.*;
public class IfElse3Equal {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter 3 nos ");
		int a=Integer.parseInt(in.readLine());
/*		int b=Integer.parseInt(in.readLine());
		int c=Integer.parseInt(in.readLine());
			
		if(a==b && a==c)
			System.out.println("3 nos are equal");
		else
			System.out.println("3 nos are NOT equal");*/
		if(a%5==0 && a%7==0)
			System.out.println("divisible by 5,7");
		else
			System.out.println("not divisible by 5,7");
	}

}
