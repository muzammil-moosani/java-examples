import java.awt.*;
import java.applet.*;
/*
	<applet code="Test6" width=400 height=400>
	</applet>
*/
public class Test6 extends Applet
{
	public void init()
	{
		setForeground(Color.red);
	}
	public void paint(Graphics g)
	{
		g.drawLine(70,10,100,100);
		g.drawLine(150,100,200,100);
		g.drawRect(35,35,30,50);
		g.fillRect(250,80,30,30);
		g.drawRoundRect(110,100,30,40,25,25);
		g.fillRoundRect(150,150,60,20,35,35);
	}
}