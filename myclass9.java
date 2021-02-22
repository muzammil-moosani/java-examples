class even
{
	public void cla()
	{
		for(int i=2;i<=100;i=i+2)
		System.out.println(" "+i+" ");
	}
}
public class myclass9
{
	public static void main(String args[])
	{
		even e=new even();
		System.out.println("This program prints first 50 even numbers");
		e.cla();
	}
}