import java.util.*;
public class math2
{
	public static void main(String args[])
	{
		double B,T,P,L,x,y,z,x3,X,Y,x4,a,b,c,d;
		Scanner ma=new Scanner(System.in);
		System.out.println("Equation 1....");
		System.out.println("Enter values of B,T,P and L:");
		B=ma.nextDouble();
		T=ma.nextDouble();
		P=ma.nextDouble();
		L=ma.nextDouble();
		a=(1*Math.cos(3.14/180*(B*T+P)))/(Math.pow(L,2)+Math.pow(B,2));
		System.out.println(a);
		System.out.println();
		System.out.println("Equation 2....");
		System.out.println("enter values of x,y and z:");
		x=ma.nextDouble();
		y=ma.nextDouble();
		z=ma.nextDouble();
		b=Math.log((x)/Math.sqrt(y*z));
		System.out.println(b);
		System.out.println();
		System.out.println("Equation 3....");
		System.out.println("Enter values of x,X and Y:");
		x3=ma.nextDouble();
		X=ma.nextDouble();
		Y=ma.nextDouble();
		c=2.5*Math.log(x3)+Math.cos(3.14/180*32)+(Math.pow(X,2)-Math.pow(Y,2));
		System.out.println(c);
		System.out.println();
		System.out.println("Equation 4....");
		System.out.println("Enter value of x:");
		x4=ma.nextDouble();
		d=(1+Math.exp(x4))/(1-Math.exp(x4));
		System.out.println(d);
	}
}