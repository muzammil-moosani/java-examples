import java.io.*;
public class steel
{
	public static void main(String args[])
	{
		Double cc,hard,str;
		int grade=7;
		try
		{
			DataInputStream am=new DataInputStream(System.in);
			System.out.println("Enter cartoon contents,hardness,strength:");
			cc=Double.parseDouble(am.readLine());
			hard=Double.parseDouble(am.readLine());
			str=Double.parseDouble(am.readLine());
			if(cc<7.5)
			grade++;
			if(hard>50)
			grade++;
			if(str>3000)
			grade++;
			System.out.println("Grade is:"+grade);
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}