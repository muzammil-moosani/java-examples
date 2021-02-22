public class interest
{
	public static void main(String args[])
	{
		double p,r,t,si;
		p=Double.parseDouble(args[0]);
		r=Double.parseDouble(args[1]);
		t=Double.parseDouble(args[2]);
		si=p*r*t*0.01;
		System.out.println("Simple  interest is: "+si);
	}
}