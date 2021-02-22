public class sum
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=2;i<=20;i=i+2)
		{
			sum+=i;
		}
		System.out.println("Sum of first 10 even numbers is: "+sum);
	}
}