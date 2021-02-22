import java.util.*;
class employee
{
	int ecode;
	String ename,deptt;
	Double salary;
	public void inputdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee code,name,department,salary:");
		ecode=sc.nextInt();
		ename=sc.next();
		deptt=sc.next();
		salary=sc.nextDouble();
	}
	public void display()
	{
		System.out.println("Employee code:"+ecode);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee department:"+deptt);
		System.out.println("Employee salary"+salary);
	}
}
class allowances extends employee
{
	Double da,ta,hra,gsal;
        public double grosspay()
	{
		da=0.75*salary;
		ta=0.15*salary;
		hra=0.25*salary;
		gsal=salary+da+ta+hra;
		System.out.println("DA:"+da);
		System.out.println("TA:"+ta);
		System.out.println("HRA:"+hra);
		System.out.println("Gross salary:"+gsal);
		return(gsal);
	}
	
}
class deductions extends employee
{
	Double pf,it,nsal;
	public void netpay(Double x)
	{
		pf=0.25*x;
		it=0.2*x;
		nsal=x-pf-it;
		System.out.println("PF:"+pf);
		System.out.println("IT:"+it);
		System.out.println("Net salary:"+nsal);
	}
}
public class emp
{
	public static void main(String args[])
	{
		Double k;
		allowances a1=new allowances();
		deductions d1=new deductions();
		a1.inputdata();
		a1.display();
		 k=a1.grosspay();
		
		d1.netpay(k);
	}
}
		
