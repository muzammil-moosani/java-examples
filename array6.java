import java.util.*;
public class array6
{
	public static void main(String args[])
	{
		int arr[][]=new int[4][4];
		int i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements:");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
				if(i==j)
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Sum of diagonal elements is:"+sum);
	}
}
