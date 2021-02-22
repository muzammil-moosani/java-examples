import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="back" width=1000 height=1000></applet> */
public class back extends Applet implements MouseListener
{
	int x,y;
	public void init()
	{
		addMouseListener(this);
	}
	public void mousePressed(MouseEvent me)
	{}
	public void mouseReleased(MouseEvent me)
	{}
	public void mouseEntered(MouseEvent me)
	{}
	public void mouseExited(MouseEvent me)
	{}
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		if((x>=10&&x<=110)&&(y>=10&&y<=110))
		setBackground(Color.red);
		 else if((x>=210&&x<=310)&&(y>=10&&y<=110))
		setBackground(Color.green);
		 else if((x>=410&&x<=510)&&(y>=10&&y<=110))
		setBackground(Color.blue);
		else
		setBackground(Color.white);
	}
	public void paint(Graphics g)
	{
		Color cr=new Color(255,0,0);
		g.setColor(cr);
		g.fillRect(10,10,100,100);
		Color cg=new Color(0,255,0);
		g.setColor(cg);
		g.fillRect(210,10,100,100);
		Color cb=new Color(0,0,255);
		g.setColor(cb);
		g.fillRect(410,10,100,100);
	}
}		