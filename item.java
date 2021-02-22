public class item
{
	public static void main(String args[])
	{
		int qty;
		double up,gamt,dis,namt;
	        qty=Integer.parseInt(args[0]);
		up=Double.parseDouble(args[1]);
		gamt=qty*up;
		dis=0.07*gamt;
		namt=gamt-dis;
		System.out.println("Gross bill amount: "+gamt);
		System.out.println("Discount offered: "+dis);
		System.out.println("Net bill amount: "+namt);
	}
}