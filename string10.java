import java.util.*;
public class string10
{
	public static void main(String args[])
	{
		String s,t;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter a String:");
		s=ma.next();
		t=s.replace('n','a');
		System.out.println("Final String:"+t);
	}
}