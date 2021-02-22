import java.util.*;
public class palindrome
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a String:");
		s1=ma.next();
		StringBuffer s3=new StringBuffer(s1);
		s3.reverse();
		s2=s3.toString();
		if(s2.equals(s1))
		System.out.println("Palindrome");
		else
		System.out.println("Not Palindrome");
	}
}