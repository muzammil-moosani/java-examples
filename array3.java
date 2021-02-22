import java.util.*;
public class array3
{
	public static void main(String args[])
	{
		int no[]=new int[10];
		int max=0,min=999;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		for(int i=0;i<10;i++)
		{
			no[i]=sc.nextInt();
			if(no[i]>max)
			max=no[i];
			if(no[i]<min)
			min=no[i];
		}
		System.out.println("Numbers you entered are as follows:");
		for(int i=0;i<10;i++)
		System.out.print(no[i]+"    ");
		System.out.println();
		System.out.println("Maximum number:"+max+"\nMinimum number:"+min);
	}
}