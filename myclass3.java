class rectvol
{
	int height,width,length;
	public void get()
	{
		height=15;
		width=11;
		length=21;
	}
	public int volume()
	{
		int vol;
		vol=height*width*length;
		return(vol);
	}
}
public class myclass3
{
	public static void main(String args[])
	{
		rectvol r=new rectvol();
		int v;
		r.get();
		v=r.volume();
		System.out.println("Volume:"+v);
	}
}