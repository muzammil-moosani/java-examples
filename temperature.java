import java.io.*;
public class temperature
{
	public static void main(String args[])
	{
		double f,c;
		try
		{
			DataInputStream am=new DataInputStream(System.in);
			System.out.println("Enter temperature in Fahrenheit: ");
			f=Double.parseDouble(am.readLine());
			c=(f-32)/1.8;
			System.out.println("The conversion of "+f+"F in Celsius is: "+c+"C");
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}