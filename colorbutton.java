import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="colorbutton" width=1000 height=1000></applet> */
public class colorbutton extends Applet implements ActionListener
{
	String s=" ";
	public void init()
	{
		Button br=new Button("RED");
		Button bg=new Button("GREEN");
		Button bb=new Button("BLUE");
		add(br);
		add(bg);
		add(bb);
		br.addActionListener(this);
		bg.addActionListener(this);
		bb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		s=ae.getActionCommand();
		if(s.equals("RED"))
		setBackground(Color.red);
		else if(s.equals("GREEN"))
		setBackground(Color.green);
		else
		setBackground(Color.blue);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("You selected:"+s,500,500);
	}
}