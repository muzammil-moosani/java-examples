public class pattern9
{
	public static void main(String args[])
	{
		int no=65;
		char ch;
		for(int i=1;i<=4;i++)
		{
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
			