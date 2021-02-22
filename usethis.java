import java.util.*;
class person
{
	String name;
	int age;
	public person(String nm,int ag)
	{
		name=nm;
		age=ag;
	}
	public person()
	{
		name=" ";
		age=0;
	}
	public person elder(person p1)
	{
		if(age>p1.age)
		return this;
		else
		return p1;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
public class usethis
{
	public static void main(String args[])
	{
		String n;
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age of 1 person:");
		n=sc.next();
		a=sc.nextInt();
		person p=new person(n,a);
		System.out.println("Enter name and age of 2 person:");
		n=sc.next();
		a=sc.nextInt();
		person q=new person(n,a);
		person r=new person();
		r=p.elder(q);
		System.out.println("Elder person is:");
		r.display();
	}
}
		
		
		