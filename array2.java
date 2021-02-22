import java.util.*;
public class array2
{
	public static void main(String args[])
	{
		int arr[][]=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			arr[i][j]=sc.nextInt();
		}
		System.out.println("Numbers you entered are:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			System.out.println(arr[i][j]);
		}
	}
}