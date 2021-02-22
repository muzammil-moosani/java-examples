import java.util.*;
public class string3
{
	public static void main(String args[])
	{
		String a;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a string:");
		a=ma.next();
		int len=a.length();
		System.out.println("The length is:"+len);
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<i;j++)
			System.out.print(a.charAt(j));
			System.out.println();
		}
	}
}