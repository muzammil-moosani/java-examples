import java.util.*;
public class math1
{
	public static void main(String args[])
	{
		double s,a,b,c,ar;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter length of sides of triangle:");
		a=ma.nextDouble();
		b=ma.nextDouble();
		c=ma.nextDouble();
		s=(a+b+c)/2;
		ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is:"+ar);
	}
}