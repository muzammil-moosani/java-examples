interface xyz
{
	public void readdata(int x,int y);
	public double avrg();
}
class abc implements xyz
{
	int a,b;
	public void readdata(int x,int y)
	{
		a=x;
		b=y;
	}
	public double avrg()
	{
		double avg;
		avg=(a+b)/2;
		return(avg);
	}
	public void error()
	{
		System.out.println("This method can't be called...");
	}
}
public class inter
{
	public static void main(String args[])
	{
		int n1,n2;
		double a;
		xyz x1=new abc();
		x1.readdata(2,4);
		a=x1.avrg();
		System.out.println("Average:"+a);
		abc p=new abc();
		p.readdata(5,7);
		a=p.avrg();
		p.error();
		System.out.println("Average:"+a);
	}
}
		
		