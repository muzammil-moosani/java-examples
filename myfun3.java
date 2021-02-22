import java.util.*;
public class myfun3
{
		static void max(double a,double b,double c)
		{
			if(a>b&&a>c)
			System.out.println(a+" is maximum");
			else if(b>a&&b>c)
			System.out.println(b+" is maximum");
			else
			System.out.println(c+" is maximum");
		}
		static double aver(double a,double b,double c)
		{
			double avg;
			avg=(a+b+c)/3;
			return(avg);
		}
		public static void main(String args[])
		{
			double no1,no2,no3,av;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 3 numbers:");
			no1=sc.nextDouble();
			no2=sc.nextDouble();
			no3=sc.nextDouble();
			max(no1,no2,no3);
			av=aver(no1,no2,no3);
			System.out.println("Average is:"+av);
		}
}