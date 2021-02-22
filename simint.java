import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="simint" width=1000 height=1000></applet> */
public class simint extends Applet
{
	int prin=15000,t=5;
	Double s,roi=7.8;
	Label si;
	public void init()
	{
		s=prin*roi*t*0.01;
		si=new Label("Simple interest="+s);
		add(si);
	}
	public void paint(Graphics g)
	{
	}
}
		