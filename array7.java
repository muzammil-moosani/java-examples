import java.util.*;
public class array7
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<9;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i]>a[j])
				{	temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<10;i++)
		System.out.println(a[i]);
	}
}