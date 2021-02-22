import java.awt.*;
import java.applet.*;
/* <applet code="draw" width=1000 height=1000></applet> */
public class draw extends Applet
{
	public void paint(Graphics g)
	{
		g.fillRect(10,10,100,100);
		g.drawRect(110,10,100,100);
		g.fillRect(210,10,100,100);
		g.drawRect(10,110,100,100);
		g.fillRect(110,110,100,100);
		g.drawRect(210,110,100,100);
		g.fillRect(10,210,100,100);
		g.drawRect(110,210,100,100);
		g.fillRect(210,210,100,100);
		Color cr=new Color(255,10,10);
		Font f1=new Font("Times new roman",Font.ITALIC,30);
		g.setFont(f1);
		g.setColor(cr);
		g.drawString("Softech",60,160);
	}
}
	