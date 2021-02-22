class a
{
	int i,j;
}
class b extends a
{
	int k;		
	void sum()
	{
		k=i+j;
		System.out.println("Sum:"+k);
	}
}
public class single1
{
	public static void main(String args[])
	{
		b b1=new b();
		b1.i=10;
		b1.j=20;
		b1.sum();
	}
}