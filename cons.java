class fact
{
	int no,fact;
	public fact()
	{
		no=6;
		fact=1;
	}
	public int facto()
	{
		for(int i=1;i<=no;i++)
		fact=fact*i;
		return fact;
	}
}
public class cons
{
	public static void main(String args[])
	{	
		int f;
		fact f1=new fact();
		f=f1.facto();
		System.out.println("Factorial:"+f);
	}
}