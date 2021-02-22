import java.util.*;
public class name
{
	public static void main(String args[])
	{
		String name;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter name of a person: ");
		name=ma.next();
		int i=1;
		while(i<=10)
		{
			System.out.println("Name: "+name);
			i++;
		}
	}
}