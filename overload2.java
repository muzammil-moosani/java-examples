import java.io.*;
public class overload
{
	static void area(Double r)
	{
		Double a;
		a=3.14*r*r;
		System.out.println("Area of circle with radius "+r+" is: "+a);
	}
	static void area(Double l,Double b)
	{
		Double a;
		a=l*b;
		System.out.println("Area of rectangle with length "+l+" and breadth "+b+" is: "+a);
	}
	public static void main(String args[])
	{
		Double x,y,z;
		try
		{
			DataInputStream sc=new DataInputStream(System.in);
			System.out.println("Enter radius of circle:");
			x=Double.parseDouble(sc.readLine());
			System.out.println("Enter length and breadth of rectangle:");
			y=Double.parseDouble(sc.readLine());
			z=Double.parseDouble(sc.readLine());
			area(x);
			area(y,z);
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}	