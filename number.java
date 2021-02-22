import java.util.*;
public class number
{
	public static void main(String args[])
	{
		int no;
		System.out.println("Enter a number: ");
		Scanner ma=new Scanner(System.in);
		no=ma.nextInt();
		if(no>0)
		System.out.println("Positive");
		if(no<0)
		System.out.println("Negative");
		if(no==0)
		System.out.println("Zero");
	}
}