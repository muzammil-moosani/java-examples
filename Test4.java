import java.awt.*;
import java.applet.*;
/*
	<applet code="Test4" width=400 height=400>
	</applet>
*/
public class Test4 extends Applet
{
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.pink);
	}
	public void paint(Graphics g)
	{
		showStatus("This applet display area of circle with 7.8 radius");
		double r,ar;
		r=7.8;
		ar=3.14*r*r;
		g.drawString("Area of circle="+ar,60,60);
	}
}