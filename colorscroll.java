import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=colorscroll width=1000 height=1000></applet> */
public class colorscroll extends Applet implements AdjustmentListener
{
	Scrollbar rhsb,ghsb,bhsb;
	public void init()
	{
		rhsb=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,200);
		ghsb=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,200);
		bhsb=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,200);
		add(rhsb);
		add(ghsb);
		add(bhsb);
		rhsb.addAdjustmentListener(this);
		ghsb.addAdjustmentListener(this);
		bhsb.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
			
		repaint();

	}
	public void paint(Graphics g)
	{
		int r1=255,g1=255,b1=255;
		Color cr=new Color(r1,10,10);
		Color cg=new Color(10,g1,10);
		Color cb=new Color(10,10,b1);
		g.setColor(cr);
		g.fillRect(100,10,100,100);
		g.setColor(cg);
		g.fillRect(300,10,100,100);
		g.setColor(cb);
		g.fillRect(500,10,100,100);
		int s1,s2,s3;
		for(s1=0;s1<s2=rhsb.getValue();s1++)
		{
			if(s2
	
	}
}
			