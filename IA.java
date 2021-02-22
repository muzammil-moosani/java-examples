import java.util.*;
class IA
{
	public static int indexoffirstone(int arr[],int low,int high)
	{
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==1)
			high=mid-1;
			else
			low=mid+1;
		}
		return mid;
	}
	public static int posoffirstone(int arr[])
	{
		int l=0,h=1;
		while(arr[h]==0)
		{
			l=h;	
			h=2*h;
		}
		return indexoffirstone(arr,l,h);
	}
	public static void main(String args[])
	{
		int arr[]={0,0,1,1,1,1};
		System.out.println("Index="+posoffirstone(arr));
	}
}