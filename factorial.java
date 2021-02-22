import java.util.*;
public class factorial
{
	public static void main(String args[])
	{
		int no,i,fact=1;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a number:");
		no=ma.nextInt();
		for(i=1;i<=no;i++)
		fact=fact*i;
		System.out.println("The factorial of "+no+" is "+fact);
	}
}