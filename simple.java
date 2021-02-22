import java.io.*;
public class simple
{
	public static void main(String args[])
	{
		double princ,roi,dur,si;
		try
		{
			DataInputStream am=new DataInputStream(System.in);
			System.out.println("Enter principle amount,rate of interest and duration in years:");
			princ=Double.parseDouble(am.readLine());
			roi=Double.parseDouble(am.readLine());
			dur=Double.parseDouble(am.readLine());
			si=princ*roi*dur*0.01;
			System.out.println("The simple interest is: "+si);
		}
		catch(Exception e)
		{
			System.out.println("Error!!");
		}

	}
}