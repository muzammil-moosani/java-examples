import java.util.*;
class student
{
	int rno;
	String nm;
	public void readdata()
	{
		System.out.println("Enter roll number and name:");
		Scanner sc=new Scanner(System.in);
		rno=sc.nextInt();
		nm=sc.next();
	}
	public void display()
	{
		System.out.println("Roll number:"+rno);
		System.out.println("Name:"+nm);
	}
}
class marks extends student
{
	double m1,m2,m3,t,p;
	char gd;
	public void inputdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 subject marks:");
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();
	}
	public void result()
	{
		t=m1+m2+m3;
		p=t/300*100;
		if(p<40)
		gd='F';
		else if(p<50)
		gd='C';
		else if(p<60)
		gd='B';
		else
		gd='A';
		System.out.println("Total marks:"+t);
		System.out.println("Percentage:"+p);
		System.out.println("Grade:"+gd);
	}
}
public class single
{
	public static void main(String args[])
	{
		marks m=new marks();
		m.readdata();
		m.inputdata();
		m.display();
		m.result();
	}
}