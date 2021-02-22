public class petrol
{
	public static void main(String args[])
	{
		double wrong=78,actual=74,amount=546,overcharged,pet_filled;
		System.out.println("Wrongly charged amount: Rs."+wrong);
		System.out.println("Actual price: Rs."+actual);
		System.out.println("Amount Rahul pay: Rs."+amount);
		pet_filled=amount/wrong;
		overcharged=pet_filled*actual;
		overcharged=amount-overcharged;
		System.out.println("Overcharged amount: Rs."+overcharged);
		System.out.println("Petrol filled: "+pet_filled+" Litres");
	}
}
		