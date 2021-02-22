import java.io.*;
class simple
{
	Double p,r,t,s;
	public void getdata(Double p,Double r,Double t)
	{
		this.p=p;
		this.r=r;
		this.t=t;
	}
	public Double interest()
	{
		s=p*r*t*0.01;
		return s;
	}
	public void display()
	{
		System.out.println("Principle amount:"+p);
		System.out.println("Rate of Interest:"+r);
		System.out.println("Time Duration:"+t);
		System.out.println("Simple Interest:"+s);
	}
}
public class thisuse
{
	public static void main(String args[])
	{
		Double a,b,c,s;
		try
		{
			DataInputStream in=new DataInputStream(System.in);
			System.out.println("Enter principle amount,rate of interest and time duration:");
			a=Double.parseDouble(in.readLine());
			b=Double.parseDouble(in.readLine());
			c=Double.parseDouble(in.readLine());
			simple s1=new simple();
			s1.getdata(a,b,c);
			s=s1.interest();
			s1.display();
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}
			