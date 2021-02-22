import java.util.*;
public class prime
{
	public static void main(String args[])
	{
		int no,i=2;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a number:");
		no=ma.nextInt();
		while(i<no)
		{
			if(no%i==0)
			{
				System.out.println(no+" is not a Prime number");
				break;
			}
			i++;
		}
		if(i==no)
		System.out.println(no+" is a Prime number");
		if(no==1)
		System.out.println(no+" is not a Prime number");
	}
}