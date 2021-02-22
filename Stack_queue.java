import static java.lang.System.out;
import java.util.*;
public class Stack_queue
{
	 Stack<Integer> s1=new Stack<Integer>();
	 Stack<Integer> s2=new Stack<Integer>();
	public static void main(String args[])
	{
		char opt='y';
		int x;
		Scanner in=new Scanner(System.in);
		while(opt=='y')
		{
			System.out.println("Select the operation you want to perform");
			System.out.println("1:Enqueue");
			System.out.println("2:Dequeue");
			int option=in.nextInt();
			switch(option)
			{
				case 1:
				System.out.println("Enter the element to be added:");
				x=in.nextInt();
				s1.push(x);
				break;
				case 2:
				if(s2.empty())
				{
					if(s1.empty())
					{
						System.out.println("Underflow");
					}
					else
					{
						while(s1.empty()!=true)
						{	
							x=s1.pop();
							s2.push(x);
						}
							x=s2.pop();
							System.out.println("Extracted element :"+x);
					}
				}
				else
				{
					x=s2.pop();
					System.out.println("Extracted element:"+x);
				}
				break;
				default:
				System.out.println("Please select 1 or 2");
				break;
			}
			System.out.println("Press y to continue");
			opt=in.next().charAt(0);
		}
	}
}
				