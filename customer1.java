import java.io.*;
class consumer
{
	int ccode
	String cname;
	String ctype;
	public void inputdata()
	{
		try
		{
			DataInputStream get=new DataInputStream(System.in);
			System.out.println("Enter consumer code,name and type:");
			ccode=Integer.parseInt(get.readLine());
			cname=get.readLine();
			ctype=get.readLine();
		}
		catch(Exception e)
		{
			System.out.println("Error!!!");
		}
	}
	public void display()
	{
		System.out.println("Consumer code:"+ccode);
		System.out.println("Consumer name:"+cname);
		System.out.println("Consumer type:"+ctype);
	}
}
class meter extends consumer
{
	