import java.io.*;
class Depreciation
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		double dep=0.0,pur_price=0.0,sal_val=0.0,yos=0.0;
		try
		{
			System.out.println("Enter the Purchase Price: ");
			pur_price=Double.parseDouble(in.readLine());
			System.out.println("Enter the Years of Service: ");
			yos=Double.parseDouble(in.readLine());
			System.out.println("Enter the annual Depreciation: ");
			dep=Double.parseDouble(in.readLine());
		}
		catch(Exception e)
		{}
		sal_val=pur_price-dep*yos;
		System.out.println("The Salvage Value is: "+sal_val);
	}
}