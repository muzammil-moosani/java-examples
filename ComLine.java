class ComLine
{
	public static void main(String args[])
	{
		int count=0,i=0;
		String str;
		count=args.length;
		System.out.println("Number of Arguments: "+count);
		while(i<count)
		{
			str=args[i];
			i++;
			System.out.println(i+": Java is "+str+"!");
		}
	}
}