import java.awt.*;
import java.applet.*;
/*
	<applet code="Test7" width=800 height=800>
	</applet>
*/
public class Test7 extends Applet
{
	public void init()
	{
		setForeground(Color.red);
	}
	public void paint(Graphics g)
	{
		g.drawOval(70,10,80,80);
		g.fillOval(150,100,120,120);
		g.drawOval(35,55,100,150);
		g.fillOval(250,50,130,80);
	}
}