import java.io.*;
class vol
{
	double length,width,height,volume;
	public vol(double l,double w,double h)
	{
		length=l;
		width=w;
		height=h;
	}
	public double volume()
	{
		volume=length*width*height;
		return volume;
	}
}
public class parameter
{
	public static void main(String args[])
	{
		double x,y,z,vo;
		try
		{
			DataInputStream in=new DataInputStream(System.in);
			System.out.println("Enter length,width and height of rectangular box:");
			x=Double.parseDouble(in.readLine());
			y=Double.parseDouble(in.readLine());
			z=Double.parseDouble(in.readLine());
			vol v=new vol(x,y,z);
			 vo=v.volume();
			System.out.println("The volume of rectangular box is:"+vo);
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}