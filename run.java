import java.util.*;
public class run
{
	public static void main(String args[])
	{
		int run;
		Scanner ma=new Scanner(System.in);
		System.out.println("Enter runs scored by a cricket player: ");
		run=ma.nextInt();
		if(run>=300)
		System.out.println("Triple Century");
		else if(run>=200)
		System.out.println("Double Century");
		else if(run>=100)
		System.out.println("Century");
		else if(run>=50)
		System.out.println("Half Century");
	}
}