import java.util.*;
public class string4
{
	public static void main(String args[])
	{
		String a;
		char b[]=new char[100];
		int len,sp,ep;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a string:");
		a=ma.next();
		System.out.println("Enter start and end position:");
		sp=ma.nextInt();
		ep=ma.nextInt();
		len=a.length();
		System.out.println("You Entered: "+a);
		System.out.println("Length: "+len);
		a.getChars(sp,ep,b,0);
		System.out.println(a);
		System.out.println(b);
	}
}