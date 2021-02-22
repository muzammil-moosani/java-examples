import java.awt.*;
import java.applet.*;
/*
	<applet code="Test8" width=500 height=500>
	</applet>
*/
public class Test8 extends Applet
{
	public void init()
	{
		setForeground(Color.magenta);
	}
	public void paint(Graphics g)
	{
		int xp[]={30,200,30,200,30};
		int yp[]={30,30,200,200,30};
		g.drawArc(70,10,80,80,0,90);
		g.fillArc(180,10,50,80,0,270);
		g.drawPolygon(xp,yp,5);
	}
}