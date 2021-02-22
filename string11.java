import java.util.*;
public class string11
{
	public static void main(String args[])
	{
		String s1,sU,sL;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a String:");
		s1=ma.next();
		sU=s1.toUpperCase();
		sL=s1.toLowerCase();
		System.out.println(s1+" in UPPER CASE is "+sU);
		System.out.println(s1+" in lower case is "+sL);
	}
}