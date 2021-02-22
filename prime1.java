import java.util.*;
public class prime1
{
	public static void main(String args[])
	{
		int no,i=1,c=0;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a number:");
		no=ma.nextInt();
		while(i<=no)
		{
			if(no%i==0)
			c++;
			i++;
		}
		if(c==2)
		System.out.println(no+" is a Prime number");
		else
		System.out.println(no+" is not a Prime number");
	}
}