class CommandLineAverage
{
	public static void main(String args[])
	{
		double s[]=new double[20];
		double tot=0;
		for(int i=0;i<args.length;i++)
		{
			s[i]=Double.parseDouble(args[i]);
			tot=tot+s[i];
		}	
		System.out.println("Sum of numbers is: "+tot);
		System.out.println("Average of numbers is: "+tot/args.length);
	}
}