import java.io.*;
public class dollar
{
	public static void main(String args[])
	{
		double dol,roe,rup;
		try
		{
			DataInputStream am=new DataInputStream(System.in);
			System.out.println("Enter amount in dollars and rate of exchange: ");
			dol=Double.parseDouble(am.readLine());
			roe=Double.parseDouble(am.readLine());
			rup=dol*roe;
			System.out.println("Amount in rupees of "+dol+" Dollars is: rs."+rup);
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}