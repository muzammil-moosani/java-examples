import java.awt.*;
import java.applet.*;
/*
	<applet code="Test3" width=400 height=400>
	</applet>
*/
public class Test3 extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
		setForeground(Color.red);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome!!! to my Applet",50,50);
	}
}