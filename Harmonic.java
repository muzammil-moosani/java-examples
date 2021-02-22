import java.io.*;
class Harmonic
{
	public static void main(String args[])
	{
		int i,n=0;
		double sum=0;
		DataInputStream in=new DataInputStream(System.in);
		try
		{
			System.out.println("Harmonic Series");
			System.out.println("Enter value of n");
			n=Integer.parseInt(in.readLine());
		}
		catch(Exception e)
		{}
		for(i=1;i<=n;i++)
		{
			sum=sum+(1/(float)i);
		}
		System.out.println("The sum is: "+sum);
	}
}		