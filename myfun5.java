import java.util.*;
public class myfun5
{
	static int facto(int f)
	{
		int i,fact=1;
		for(i=1;i<=f;i++)
		fact=fact*i;
		return(fact);
	}
	public static void main(String args[])
	{
		int no,fa;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		no=sc.nextInt();
		fa=facto(no);
		System.out.println("Factorial of "+no+" is:"+fa);
	}
}