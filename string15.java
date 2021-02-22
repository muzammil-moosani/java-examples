import java.util.*;
public class string15
{
	public static void main(String args[])
	{
		String s1,s2,s3;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter 2 Strings:");
		s1=ma.next();
		s2=ma.next();
		if(s1.equalsIgnoreCase(s2))
		System.out.println("Both the Strings are equal");
		else
		{
			s3=s1.concat(s2);
		System.out.println("Concatenated String:"+s3);
		}
	}
}