class FindPrime
{
	public static void main(String args[])
	{
		int num;
		boolean isPrime=true;
		num=14;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num+" is Prime");
		}
		else
		{
			System.out.println(num+" is Not prime");
		}
	}
}
		
		