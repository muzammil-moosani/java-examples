class person
{
	int age;
	String nm;
	public void readdata(int a,String b)
	{
		age=a;
		nm=b;
	}
	public boolean check(person p1)
	{
		if(age==p1.age)
		return true;
		else
		return false;
	}
}
public class myclass5
{
	public static void main(String args[])
	{
		person p=new person();
		person q=new person();
		person r=new person();
		p.readdata(20,"Mohit");
		q.readdata(21,"Lavneet");
		r.readdata(20,"Muzammil");
		System.out.println("Mohit==Lavneet "+(p.check(q)));
		System.out.println("Lavneet==Muzammil "+(q.check(r)));
		System.out.println("Muzammil==Mohit "+(r.check(p)));
	}
}