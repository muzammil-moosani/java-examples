import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=rectapplet width=1000 height=1000></applet> */
public class rectapplet extends Applet implements MouseListener
{
	int w,x,y,z;
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.blue);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{}
	public void mouseEntered(MouseEvent me)
	{}
	public void mouseExited(MouseEvent me)
	{}
	public void mousePressed(MouseEvent me)
	{
		w=me.getX();
		x=me.getY();
	}
	public void mouseReleased(MouseEvent me)
	{
		y=me.getX();
		z=me.getY();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawRect(w,x,y-w,z-x);
	}
}
		