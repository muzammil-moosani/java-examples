public class pattern7
{
	public static void main(String args[])
	{
		int no;
		char ch;
		for(int i=1;i<=4;i++)
		{
			no=65;
			for(int j=1;j<=i;j++)
			{
				ch=(char)no;
				System.out.print(" "+ch+" ");
				no++;
			}
			System.out.println();
		}
	}
}				