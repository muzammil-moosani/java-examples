import java.util.*;
public class calci
{
	public static void main(String args[])
	{
		double no,a,b,c,d;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a number:");
		no=ma.nextDouble();
		a=Math.sin(3.14/180*no);
		b=Math.exp(no);
		c=Math.sqrt(no);
		d=Math.log(no);
		System.out.println("Sine of "+no+" is:"+a);
		System.out.println("Exponential of "+no+" is:"+b);
		System.out.println("Square root of "+no+" is:"+c);
		System.out.println("Logarithm of "+no+" is:"+d);
	}
}