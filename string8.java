import java.util.*;
public class string8
{
	public static void main(String args[])
	{
		String s1,s2;
		int sp,ep;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a string:");
		s1=ma.next();
		System.out.println("Enter start and end position:");
		sp=ma.nextInt();
		ep=ma.nextInt();
		System.out.println("Enter replacing string:");
		s2=ma.next();
		StringBuffer s3=new StringBuffer(s1);
		s3.replace(sp,ep,s2);
		System.out.println(s3);
	}
}		
		