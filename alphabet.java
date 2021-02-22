import java.util.*;
public class alphabet
{
	public static void main(String args[])
	{
		String a;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		a=ma.next();
		if(a.equals("a")||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u"))
		System.out.println("Vowel");
		else
		System.out.println("Consonant");
	}
}