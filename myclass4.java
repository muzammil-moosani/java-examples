import java.util.*;
class rup
{
	Double Dol,roi;
	public void getData(Double x,Double y)
	{
		Dol=x;
		roi=y;
	}
	public Double convert()
	{
		Double rs;
		rs=Dol*roi;
		return(rs);
	}
}
public class myclass4
{
	public static void main(String args[])
	{
		Double Dollar,rate,rupee;
		rup r=new rup();
		System.out.println("Enter amount in Dollars and rate of exchange:");
		Scanner sc=new Scanner(System.in);
		Dollar=sc.nextDouble();
		rate=sc.nextDouble();
		r.getData(Dollar,rate);
		rupee=r.convert();
		System.out.println("The amount in rupees is:"+rupee);
	}
}
