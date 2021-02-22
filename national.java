import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=national width=1000 height=1000></applet> */
public class national extends Applet implements ItemListener,ActionListener
{
	Button b;
	Checkbox c1,c2,c3,c4,c5,c6;
	CheckboxGroup cbg;
	String s=" ",msg=" ";
	public void init()
	{
		b=new Button("PRINT");
		cbg=new CheckboxGroup();
		c1=new Checkbox("National Bird",false,cbg);
		c2=new Checkbox("National Flag",false,cbg);
		c3=new Checkbox("Natinal Animal",false,cbg);
		c4=new Checkbox("National Capital",false,cbg);
		c5=new Checkbox("National Anthem",false,cbg);
		c6=new Checkbox("National Currency",false,cbg);
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
		s=cbg.getSelectedCheckbox().getLabel();
		if(s.equals(c1.getLabel()))
		msg="National Bird:Peacock";
		else if(s.equals(c2.getLabel()))
		msg="National Flag:Tricolor";
		else if(s.equals(c3.getLabel()))
		msg="National Animal:Tiger";
		else if(s.equals(c4.getLabel()))
		msg="National Capital:Delhi";
		else if(s.equals(c5.getLabel()))
		msg="National Anthem:Jana Gana";
		else 
		msg="National Currency:Rupee";
		repaint();
	}
	public void actionPerformed(ActionEvent ae)
	{
		s="Your Answer is:       "+msg;
		repaint();
	}
	public void paint(Graphics g)
	{
		
		g.drawString(s,100,100);
	}
}