import java.io.*;
public class circle
{
	public static void main(String args[])
	{
		double r,ar=0;
		try
		{
			DataInputStream am=new DataInputStream(System.in);
			System.out.println("Enter radius of circle: ");
			r=Double.parseDouble(am.readLine());
			ar=3.14*r*r;
			System.out.println("Area of circle with radius "+r+" is: "+ar);
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}
