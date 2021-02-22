import java.applet.*;
import java.awt.*;
/*
	<applet code="Test2" width=200 height=200>
	</applet>
*/
public class Test2 extends Applet
{
	public void paint(Graphics g)
	{
		double l,w,a,p;
		l=7.8;
		w=3.5;
		a=l*w;
		p=2*(l+w);
		g.drawString("Area="+a,50,50);
		g.drawString("Perimeter="+p,50,80);
	}
}