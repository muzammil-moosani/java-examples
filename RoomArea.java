class Room
{
	float length,breadth;
	void getdata(float x,float y)
	{
		length=x;
		breadth=y;
	}
}
class RoomArea
{
	public static void main(String args[])
	{
		float area;
		Room r1=new Room();
		r1.getdata(10,20);
		area=r1.length*r1.breadth;
		System.out.println("Area: "+area);
	}
}
		