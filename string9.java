import java.util.*;
public class string9
{
	public static void main(String args[])
	{
		String s1,s2,s3;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a string:");
		s1=ma.next();
		System.out.println("Enter another string:");
		s2=ma.next();
		s3=s1.concat(s2);
		System.out.println("Final String: "+s3);
	}
}