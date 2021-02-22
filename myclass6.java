import java.util.*;
class add
{
	int no1,no2;
	public void read(int x,int y)
	{
		no1=x;
		no2=y;
	}
	public add sum(add a)
	{
		add b=new add();
		b.no1=no1+a.no1;
		b.no2=no2+a.no2;
		return(b);
	}
	public void show()
	{
		System.out.println(no1);
		System.out.println(no2);
	}
}
public class myclass6
{
	public static void main(String args[])
	{
		int n1,n2;
		add a1=new add();
		add a2=new add();
		add a3=new add();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integers for first object:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		a1.read(n1,n2);
		System.out.println("Enter two integers of second object:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		a2.read(n1,n2);
		a3=a1.sum(a2);
		System.out.println("Sum of objects is:");
		a3.show();
	}
}
		
		