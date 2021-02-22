import java.util.*;
class bank
{
	String name,type,ac_no;
	Double bal;
	public void read()
	{
		name="Raj";
		type="Savings";
		ac_no="0145786";
		bal=37000.00;
	}
	public void depamt(Double x)
	{
		bal=bal+x;
		System.out.println("Total amount after deposition:"+bal);
	}
	public void withdraw(Double y)
	{
		System.out.println("Balance before withdrawal is Rs."+bal);
		bal=bal-y;
		System.out.println("Balance after withdrawal of Rs."+y+" is Rs."+bal);
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Balance:"+bal);
	}
}
public class myclass7
{
	public static void main(String args[])
	{
		double damt,wamt;
		bank b=new bank();
		b.read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter depositing amount:");
		damt=sc.nextDouble();
		b.depamt(damt);
		System.out.println("Enter withdrawal amount:");
		wamt=sc.nextDouble();
		b.withdraw(wamt);
		System.out.println("Account details:");
		b.display();
	}
}