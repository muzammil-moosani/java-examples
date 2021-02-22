import java.util.*;
public class unconditional
{
	public static void main(String args[])
	{
		int no,max=0;
		Scanner ma=new Scanner(System.in);
		for(;;)
		{
			System.out.println("Enter a number:");
			no=ma.nextInt();
			if(no==0)
			break;
			if(no>max)
			max=no;
		}
		System.out.println("Maximum among all is: "+max);
	}
}