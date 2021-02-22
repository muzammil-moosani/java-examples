import java.awt.*;
import java.applet.*;
/*
	<applet code="Test5" width=400 height=400>
	</applet>
*/
public class Test5 extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.yellow);
		Color c1=new Color(240,10,10);
		Font f1=new Font("Arial",Font.BOLD,24);
		g.setColor(c1);
		g.setFont(f1);
		g.drawString("Softech",50,50);
		Color c2=new Color(10,240,10);
		Font f2=new Font("Times",Font.PLAIN,18);
		g.setColor(c2);
		g.setFont(f2);
		g.drawString("Informatic",70,70);
		Color c3=new Color(10,10,240);
		Font f3=new Font("Book Antique",Font.ITALIC,20);
		g.setColor(c3);
		g.setFont(f3);
		g.drawString("System",90,90);
	}
}