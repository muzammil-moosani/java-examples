import java.io.*;
class Price
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		double rs=0,ps1;
		int ps2;
		try
		{
			System.out.println("Enter price in decimal form: ");
			rs=Double.parseDouble(in.readLine());
		}
		catch(Exception e)
		{}
		ps1=rs*100;
		ps2=(int)ps1;
		System.out.println("The price in paise is: "+ps2);
	}
}
		