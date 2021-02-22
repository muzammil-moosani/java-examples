import java.util.*;
public class myfun4
{
	static double area(double b,double p)
	{
		double ar;
		ar=0.5*b*p;
		return(ar);
	}
	public static void main(String args[])
	{
		double base,perp,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and perpendicular:");
		base=sc.nextDouble();
		perp=sc.nextDouble();
		area=area(base,perp);
		System.out.println("Area of triangle:"+area);
	}
}