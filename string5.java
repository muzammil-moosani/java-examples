import java.util.*;
public class string5
{
	public static void main(String args[])
	{
		String s1,s3;
		int a;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter String:");
		s1=ma.next();
		System.out.println("Enter another String:");
		s3=ma.next();
		System.out.println("Enter position:");
		a=ma.nextInt();
		StringBuffer s2=new StringBuffer(s1);
		s2.insert(a,s3);
		System.out.println(s2);
		System.out.print(s1);
	}
} 