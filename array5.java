import java.util.*;
public class array5
{
	public static void main(String args[])
	{
		String name[]=new String[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 20 names:");
		for(int i=0;i<20;i++)
		{
			name[i]=sc.next();
		}
		System.out.println("Names in reverse order:");
		for(int i=19;i>=0;i--)
		System.out.print(name[i]+"  ");
	}
}
		