class Segment
{
	int st[];
	Segment(int arr[],int n)
	{
		int x=(int)(Math.ceil(Math.log(n)/Math.log(2)));
		int max_size=2*(int)Math.pow(2,x)-1;
		st=new int[max_size];
		constructSTutil(arr,0,n-1,0);
	}
	int getMid(int s,int e)
	{
		return s+(e-s)/2;
	}
	int getSumutil(int ss,int se,int qs,int qe,int si)
	{
		if(qs<=ss&&qe>=se)
		return st[si];
		if(se<qs||ss>qs)
		return 0;
		int mid=getMid(ss,se);
		return getSumutil(mid+1,se,qs,qe,2*si+2);
	}	
	void updatevalueutil(int ss,int se,int i,int diff,int si)
	{
		if(i<ss||i>se)
		return ;
		st[si]=st[si]+diff;
		if(se!=ss)
		{
			int mid=getMid(ss,se);
			updatevalueutil(ss,mid,i,diff,2*si+1);
			updatevalueutil(mid+1,se,i,diff,2*si+2);
		}
	}
	void updatevalue(int arr[],int n,int i,int new_val)
	{
		if(i<0||i>n-1)
		{
			System.out.println("Invalid Input");
			return;
		}
		int diff=new_val-arr[i];
		arr[i]=new_val;
		updatevalueutil(0,n-1,i,diff,0);
	}
	int getSum(int n,int qs,int qe)
	{
		if(qs<0||qe>n-1||qs>qe)
		{
			System.out.println("Invalid Input");
			return -1;
		}
		return getSumutil(0,n-1,qs,qe,0);
	}
	int constructSTutil(int arr[],int ss,int se,int si)
	{
		if(ss==se)
		{
			st[si]=arr[ss];
			return arr[ss];
		}
		int mid=getMid(ss,se);
		st[si]=constructSTutil(arr,ss,mid,si*2+1)+constructSTutil(arr,mid+1,se,si*2+2);
		return st[si];
	}
	public static void main(String args[])
	{
		int arr[]={1,3,5,7,9,11,22,44,33,55};
		int n=arr.length;
		Segment t=new Segment(arr,n);
		System.out.println("Sum of values in given range="+t.getSum(n,1,3));
		t.updatevalue(arr,n,1,10);
		System.out.println("Updated sum of values in given range="+t.getSum(n,1,3));
	}
}
		
	