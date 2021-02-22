import java.util.*;
public class string6
{
	public static void main(String args[])
	{
		String s1;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a string:");
		s1=ma.next();
		StringBuffer s2=new StringBuffer(s1);
		s2.reverse();
		System.out.println("The reverse of "+s1+" is: "+s2);
	}
}