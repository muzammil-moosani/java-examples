import java.util.*;
public class root
{
	public static void main(String args[])
	{
		double no,sr=0;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a number:");
		no=ma.nextDouble();
		sr=Math.sqrt(no);
		System.out.println("Square root of "+no+" is:"+sr);
	}
}