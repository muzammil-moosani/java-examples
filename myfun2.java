import java.io.*;
public class myfun2
{
	static double total(double a,double b,double c)
	{
		double tot;
		tot=a+b+c;
		return(tot);
	}
	static double perc(double a)
	{
		double per;
		per=a/300*100;
		return(per);
	}
	static double average(double a)
	{
		double avg;
		avg=a/3;
		return(avg);
	}
	static void print()
	{
		for(int i=1;i<=20;i++)
		System.out.print("*");
		System.out.println();
	}
	public static void main(String args[])
	{
		double m1,m2,m3,t,p,av;
		try
		{
			DataInputStream in=new DataInputStream(System.in);
			System.out.println("Enter marks of 3 subjects each out of 100:");
			m1=Double.parseDouble(in.readLine());
			m2=Double.parseDouble(in.readLine());
			m3=Double.parseDouble(in.readLine());
			t=total(m1,m2,m3);
			p=perc(t);
			av=average(t);
			print();
			System.out.println("Total:"+t+"\nAverage:"+av+"\nPercentage:"+p);
			print();
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}