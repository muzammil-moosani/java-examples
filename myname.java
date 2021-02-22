import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*    <applet code="myname" width=1000 height=1000></applet>      */
public class myname extends Applet implements MouseListener
{
	String nm="Prince Muzammil";
	int x,y;
	public void init()
	{	
		setBackground(Color.black);
		setForeground(Color.white);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{}
	public void mouseExited(MouseEvent me)
	{}
	public void mousePressed(MouseEvent me)
	{}
	public void mouseReleased(MouseEvent me)
	{}
	public void paint(Graphics g)
	{
		g.drawString(nm,x,y);
	}
}