import java.util.*;
public class myfun1
{
	 static double simple(double x,double y,double z)
	{
		double i;
		i=x*y*z*0.01;
		return(i);
	}
	public static void main(String args[])
	{
		double p,r,t,si;
		Scanner fc=new Scanner(System.in);
		System.out.println("Enter principle amount,rate of interest,time in years");
		p=fc.nextDouble();
		r=fc.nextDouble();
		t=fc.nextDouble();
		si=simple(p,r,t);
		System.out.println("The simple interest is:"+si);
	}
}