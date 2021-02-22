class Box
{
	double width;
	double height;
	double depth;
	Box(Box ob)
	{
		width=ob.width;	
		height=ob.height;
		depth=ob.depth;
	}
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	Box(double len)
	{
		width=height=depth=len;
	}
	Box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight(double w,double h,double d,double m)
	{
		width=w;
		height=h;
		depth=d;
		weight=m;
	}
}
class RefDemo
{
	public static void main(String args[])
	{
		BoxWeight weightbox=new BoxWeight(3,5,7,8.37);
		Box plainbox =new Box();
		double vol;
		vol=weightbox.volume();
		System.out.println("Volume of mybox1 is "+vol);
		System.out.println("Weight of mybox1 is "+weightbox.weight);
		System.out.println();
		plainbox=weightbox;
		vol=plainbox.volume();
		System.out.println("Volume of mybox2 is "+vol);
	}
}