import java.util.*;
class shop
{
	int pcode;
	String pname;
	public void inputdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product code:");
		pcode=sc.nextInt();
		System.out.println("Enter Product name:");
		pname=sc.next();
	}
	public void display()
	{
		System.out.println("Product code:"+pcode);
		System.out.println("Product name:"+pname);
	}
}
class customer extends shop
{
	int qty;
	double up,bamt;
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product quantity:");
		qty=sc.nextInt();
		System.out.println("Enter Product unit price:");
		up=sc.nextDouble();
	}
	public void show()
	{
		bamt=qty*up;
		System.out.println("Product quantity:"+qty);
		System.out.println("Product unit price:"+up);
		System.out.println("Billing amount:"+bamt);
	}
}
class bill extends customer
{
	double dis;
	double namt;
	public void discal()
	{
		if(qty<=50)
		dis=0.15;
		else if(qty<=100)
		dis=0.2;
		else
		dis=0.3;
		namt=bamt-(dis*bamt);
	}
	public void billing()
	{
		System.out.println("Discount:"+dis);
		System.out.println("Net bill amount:"+namt);
	}
}
public class multi
{
	public static void main(String args[])
	{
		bill b1=new bill();
		b1.inputdata();
		b1.getdata();
		b1.show();
		b1.discal();
		b1.display();
		b1.billing();
	}
}
	