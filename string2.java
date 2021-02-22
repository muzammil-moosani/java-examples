import java.io.*;
public class string2
{
	public static void main(String args[])
	{
		int age=0;
		String nat="0";
		try
		{
			DataInputStream am=new DataInputStream(System.in);
			System.out.println("Enter age and nationality of a person:");
			age=Integer.parseInt(am.readLine());
			nat=am.readLine();
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
			if(nat.equals("indian")&&age>=18)
			System.out.println("Eligible");
			else
			System.out.println("Not Eligible");
	}
}
			
		
	