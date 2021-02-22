import java.util.*;
public class leap
{
	public static void main(String args[])
	{
		int year;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter year: ");
		year=ma.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0))
		System.out.println(year+" is a Leap year");
		else
		System.out.println(year+" is not a Leap year");
	}
}
		