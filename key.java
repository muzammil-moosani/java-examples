import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=key width=1000 height=1000></applet> */
public class key extends Applet implements KeyListener
{
	String nm="Muzammil";
	int code,x=500,y=500;
	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}
	public void keyPressed(KeyEvent ke)
	{
		code=ke.getKeyCode();
		if(code==ke.VK_UP)
                        y=y-10;
                if(code==ke.VK_DOWN)
                        y=y+10;
                if(code==ke.VK_LEFT)
                       x=x-10;
                if(code==ke.VK_RIGHT)
                       x=x+10;
                repaint();
	}
	public void keyReleased(KeyEvent ke)
	{}
	public void keyTyped(KeyEvent ke)
	{}
	public void paint(Graphics g)
	{
		g.drawString(nm,x,y);
	}
}
		
