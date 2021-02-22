import java.util.*;
class area_of_rect
{
	Double l,b,area;
	public area_of_rect(Double x,Double y)
	{
		l=x;
		b=y;
	}
	public area_of_rect()
	{
		l=5.5;
		b=7.8;
	}
	public Double area()
	{
		area=l*b;
		return area;
	}
}
public class coverload
{
	public static void main(String args[])
	{
		double a,b,ar1,ar2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		area_of_rect a1=new area_of_rect(a,b);
		area_of_rect a2=new area_of_rect();
		ar1=a1.area();
		ar2=a2.area();
		System.out.println(ar1+"\n"+ar2);
	}
}
		
		