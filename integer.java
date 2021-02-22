import java.util.*;
public class integer
{
	public static void main(String args[])
	{
		int no,avg=0,c=0,tot=0;
		Scanner ma=new Scanner(System.in);
		for(;;)
		{	System.out.println("Enter a number:");
			no=ma.nextInt();
			if(no==0)
			break;
			if(no<0)
			continue;
			c++;
			tot=tot+no;
		}
		avg=tot/c;
		System.out.println("Average of "+c+" numbers is: "+avg);
	}
}
			