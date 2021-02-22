import java.util.*;
class number
{
	int no1,no2,no3;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		no1=sc.nextInt();
		no2=sc.nextInt();
		no3=sc.nextInt();
	}
	public void result()
	{
		int max=0,min=999;
		if(no1>no2)
		{
			if(no1>no3)
			max=no1;
			else
			max=no3;
		}
		else
		{
			if(no2>no3)
			max=no2;
			else
			max=no3;
		}
		if(no1<no2)
		{
			if(no1<no3)
			min=no1;
			else
			min=no3;
		}
		else
		{
			if(no2<no3)
			min=no2;
			else
			min=no3;
		}
		System.out.println("Maximum number:"+max);
		System.out.println("Minimum number:"+min);
	}
};
public class myclass2
{
	public static void main(String args[])
	{
		number n=new number();
		n.read();
		n.result();
	}
}
		