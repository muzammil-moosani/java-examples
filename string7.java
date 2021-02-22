import java.util.*;
public class string7
{
	public static void main(String args[])
	{
		String s1;
		int sp,ep;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter string:");
		s1=ma.next();
		System.out.println("Enter start and end position:");
		sp=ma.nextInt();
		ep=ma.nextInt();
		StringBuffer s2=new StringBuffer(s1);
		s2.delete(sp,ep);
		System.out.println(s1);
		System.out.println(s2);
	}
}