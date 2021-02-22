import java.util.*;
class area
{
	double side1,side2,side3;
	public void get(double x,double y,double z)
	{
		side1=x;
		side2=y;
		side3=z;
	}
	public double triarea()
	{
		double s,ar;
		s=(side1+side2+side3)/2;
		ar=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return(ar);
	}
}
public class myclass8
{
	public static void main(String args[])
	{
		double a,b,c,area;
		area a1=new area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 sides of triangle:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		a1.get(a,b,c);
		area=a1.triarea();
		System.out.println("Area of triangle is:"+area);
	}
}
		