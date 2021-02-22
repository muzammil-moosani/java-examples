class x
{
	int a;
	public x(int x)
	{
		a=x;
	}
	public void show()
	{
		System.out.println(" "+a);
	}
}
class y extends x
{
	int b;
	public y(int x,int y)
	{
		super(y);
		b=x;
	}
	public void display()
	{
		System.out.println(" "+b);
	}
}
class z extends y
{
	int c;
	public z(int x,int y,int z)
	{
		super(y,z);
		c=x;
	}
	public void print()
	{
		System.out.println(" "+c);
	}
}
public class usesuper
{
	public static void main(String args[])
	{
		z m=new z(10,20,30);
		m.show();
		m.display();
		m.print();
	}
} 