import java.util.*;
public class string12
{
	public static void main(String args[])
	{
		String s,sw,ew;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a string:");
		s=ma.next();
		System.out.println("Enter starts with and ends with strings:");
		sw=ma.next();
		ew=ma.next();
		if(s.startsWith(sw))
		System.out.println(s+" starts with "+sw);
		else
		System.out.println("no");
		if(s.endsWith(ew))
		System.out.println(s+" ends with "+ew);
		else
		System.out.println("NO");
	}
}