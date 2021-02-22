class Box
{
	double width;
	double height;
	double depth;
	Box(double w,double h,double d)
	{
		width=d;
		height=h;
		depth=d;
	}
	Box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	Box(double l)
	{
		width=height=depth=l;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class OverloadCons
{
	public static void main(String args[])
	{
		Box mybox1=new Box(10,20,150);
		Box mybox2=new Box();
		Box mycube=new Box(7);
		double vol;
		vol=mybox1.volume();
		System.out.println("Volume of mybox1 is "+vol);
		vol=mybox2.volume();
		System.out.println("Volume of mybox2 is "+vol);
		vol=mycube.volume();
		System.out.println("Volume of mycube is "+vol);
	}
}