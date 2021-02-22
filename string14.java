import java.util.*;
public class string14
{
	public static void main(String args[])
	{
		String ls,us;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter your name in small letters:");
		ls=ma.next();
		System.out.println("You entered:"+ls);
		us=ls.toUpperCase();
		System.out.println("Your name in capital letters is:"+us);
	}
}