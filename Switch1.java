import java.util.*;
public class Switch
{
	public static void main(String args[])
	{
		int no1,no2,ch,t=0;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		no1=ma.nextInt();
		no2=ma.nextInt();
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Division");		
		System.out.println();
		System.out.println("Please enter your choice: ");
		ch=ma.nextInt();	
		switch(ch)
		{
			case 1:
			t=no1+no2;
			break;
			case 2:
			t=no1/no2;
			break;
			default:
			System.out.println("Wrong input choice");
		}
		System.out.println("Result = "+t);
	}
}
			