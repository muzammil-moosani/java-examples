import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=order width=1000 height=1000></applet> */
public class order extends Applet implements ItemListener,ActionListener
{
	Label l;
	Button b;
	Checkbox c1,c2,c3,c4,c5,c6;
	int tot=0;
	String s=" ";
	public void init()
	{
		l=new Label("Ajmer Food Court");
		b=new Button("BIIL");
		c1=new Checkbox("PIZZA@170/-");
		c2=new Checkbox("MOMOS@100/-");
		c3=new Checkbox("BURGER@110/-");
		c4=new Checkbox("DOSA@120/-");
		c5=new Checkbox("PASTA@85/-");
		c6=new Checkbox("CHOWMEIN@80/-");
		add(l);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(b);
		b.addActionListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		c6.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void actionPerformed(ActionEvent ae)
	{
		s="Total Bill Amount:"+tot;
		repaint();
	}
	public void paint(Graphics g)
	{
		tot=0;
		if(c1.getState())
		tot+=170;
		if(c2.getState())
		tot+=100;
		if(c3.getState())
		tot+=110;
		if(c4.getState())
		tot+=120;
		if(c5.getState())
		tot+=85;
		if(c6.getState())
		tot+=80;
		g.drawString(s,100,100);
	}
}