import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=Country width=1000 height=1000></applet> */
public class country extends Applet implements ItemListener
{
	String cap=" ",cur=" ";
	List country;
	Label l;
	public void init()
	{
		l=new Label("Select Country");
		country=new List(3,true);
		country.add("INDIA");
		country.add("USA");
		country.add("UAE");
		country.add("GERMANY");
		country.add("ENGLAND");
		add(l);
		add(country);
		country.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		String s[]=country.getSelectedItems();
		for(int i=0;i<s.length();i++)
		{
			if(s[i].equals("INDIA"))
			{
				cap="DELHI";
				cur="RUPEE";
			}
			if(s[i].equals("USA"))
			{
				cap="WASHINGTON";
				cur="US DOLLAR";
			}
			if(s[i].equals("UAE"))
			{
				cap="ABU DHABI";
				cur="UAE DIRHAM";
			}
			if(s[i].equals("GERMANY"))
			{
				cap="BERLIN";
				cur="EURO";
			}
			if(s[i].equals("ENGLAND"))
			{
				cap="LONDON";
				cur="POUND STRELING";
			}
		}
	}
}
			
				