class OverloadDemo
{
	void test()
	{
		System.out.println("No Parameters");
	}
	void test(int a,int b)
	{
		System.out.println("a and b: "+a+" "+b);
	}
	void test(double a)
	{
		System.out.println("double a: "+a);
	}
}
class Overload1
{
	public static void main(String args[])
	{
		OverloadDemo ob=new OverloadDemo();
		ob.test();
		ob.test(10);
		ob.test(10,20);
		ob.test(123.25);
	}
}