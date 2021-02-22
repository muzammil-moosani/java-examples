public class pattern8
{
	public static void main(String args[])
	{
		char ch;
		int no=65;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				ch=(char)no;
				System.out.print(" "+ch+" ");
			}
			no++;
			System.out.println();
		}
	}
}
				
			