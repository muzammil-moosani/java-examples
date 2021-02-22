import java.io.*;
class Reading
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int inta=0;
		float floata=0.0f;
		try
		{
			System.out.print("Enter an Integer: ");
			inta=Integer.parseInt(in.readLine());
			System.out.print("Enter a float number: ");
			floata=Float.parseFloat(in.readLine());
		}
		catch (Exception e) {}
		System.out.println("Integer Number: "+inta);
		System.out.println("Float Number: "+floata);
	}
}