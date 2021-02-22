import java.io.*;
public class area
{
	public static void main(String args[])
	{
		double base,height,area;
		try
		{
			DataInputStream am=new DataInputStream(System.in);
			System.out.println("Enter Base and Height of triangle:");
			base=Double.parseDouble(am.readLine());
			height=Double.parseDouble(am.readLine());
			area=0.5*base*height;
			System.out.println("Area of triangle  is: "+area);
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}