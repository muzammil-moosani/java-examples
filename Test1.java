import java.applet.*;
import java.awt.*;
/*
	<applet code="Test1" width=200 height=200>
	</applet>
*/
public class Test1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome to my first Applet",50,50);
	}
}