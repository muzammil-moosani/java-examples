import java.util.*;
class Decimal
{
	private static void findMajority(int arr[])
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int count=map.get(arr[i])+1;
				if(count>arr.length/10)
				{
					System.out.println("Majority found:"+arr[i]);
					return;
				}
				else
				map.put(arr[i],count);
			}
			else
			map.put(arr[i],1);
		}
			System.out.println("No majority element");
	}
	public static void main(String args[])
	{
		int a[]=new int[]{2,5,5,2,3,3,3,12,7,8,9,10,33,22,44,55,66,77,88,99,12,34,76,89,};
		findMajority(a);
	}
}
	