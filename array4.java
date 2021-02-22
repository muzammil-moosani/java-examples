import java.util.*;
public class array4
{
	public static void main(String args[])
	{
		int a1[]=new int[10];
		int a2[]=new int[10];
		int pro[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 array:");
		for(int i=0;i<10;i++)
		a1[i]=sc.nextInt();
		System.out.println("Enter 2 array:");
		for(int i=0;i<10;i++)
		a2[i]=sc.nextInt();
		for(int i=0;i<10;i++)
		pro[i]=a1[i]*a2[i];
		System.out.println("The product of both arrays are:");
		for(int i=0;i<10;i++)
		System.out.print(pro[i]+"  ");
	}
}
	