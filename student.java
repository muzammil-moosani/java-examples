import java.io.*;
public class student
{
	public static void main(String args[])
	{
		int rno,Class;
		String name;
		double m1,m2,m3,perc;
		try
		{
			DataInputStream am=new DataInputStream(System.in);
			System.out.println("Enter Roll number,Name,Class and marks of 3 subjects out of 100: ");
			rno=Integer.parseInt(am.readLine());
			name=am.readLine();
			Class=Integer.parseInt(am.readLine());
			m1=Double.parseDouble(am.readLine());
			m2=Double.parseDouble(am.readLine());
			m3=Double.parseDouble(am.readLine());
                        perc=(m1+m2+m3)/300*100;
			System.out.println("Roll number: "+rno);
			System.out.println("Name: "+name);
			System.out.println("Class: "+Class);
			System.out.println("Percentage: "+perc+"%");
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}