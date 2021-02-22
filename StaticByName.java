class StaticDemo
{
	static int a=42;
	static int b;
	static void callme()
	{
		System.out.println("a= "+a);
	}
	static void meth(int x)
	{
		b=x;
	}
}
class StaticByName
{
	public static void main(String args[])
	{
		StaticDemo.callme();
		StaticDemo.meth(100);
		System.out.println("b= "+StaticDemo.b);
	}
}