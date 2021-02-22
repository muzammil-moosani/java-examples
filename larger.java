public class larger
{
	public static void main(String args[])
	{
		int a,b,c;
		a=88;
		b=29;
		c=97;
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		if(a>b&&a>c)
		System.out.println("A is larger");
		else if(c>a&&c>b)
		System.out.println("C is larger");
		else 
		System.out.println("B is larger");
	}
}