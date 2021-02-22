import java.util.*;
public class array1
{
	public static void main(String args[])
	{
		Double arr[]=new Double[5];
		Double tot=0.0,avg=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects:");
		for(int i=0;i<=4;i++)
		{
			arr[i]=sc.nextDouble();
			tot=tot+arr[i];
		}
		avg=tot/5;
		System.out.println("Total marks:"+tot);
		System.out.println("Average marks:"+avg);
		System.out.println("Marks in 5 subjects:");
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
	}
}