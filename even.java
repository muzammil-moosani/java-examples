import java.util.*;
public class even
{
	public static void main(String args[])
	{
		double no;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a number: ");
		no=ma.nextDouble();
		if(no%2==0)
		System.out.println("Even number");
		else
		System.out.println("Odd number");
	}
}