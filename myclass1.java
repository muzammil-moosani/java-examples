class triangle
{
	double base,height;
}
public class myclass1
{
	public static void main(String args[])
	{
		double ar;
		triangle t=new triangle();
		t.base=7.9;
		t.height=11.8;
		ar=0.5*t.base*t.height;
		System.out.println("Area of triangle with base "+t.base+" and height "+t.height+" is "+ar);
	}
}