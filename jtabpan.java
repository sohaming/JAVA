import java.awt.*;
import javax.swing.*;
public class jtabpan extends JFrame
{
 jtabpan()
 {
 JTabbedPane jtp = new JTabbedPane();
 jtp.addTab("cities",new cities());
 jtp.addTab("color",new color());
 add(jtp);
 setVisible(true);
 setSize(400,500);
	
	 		
 }
 public static void main(String args[])
{
	new jtabpan();
}


public class cities extends JPanel
{
  public cities()
 {
 JButton b1 = new JButton("JALNA");
	add(b1);
 JButton b2 = new JButton("PUNE");
	add(b2);
 JButton b3 = new JButton("BOMBAY");
	add(b3);
 JButton b4 = new JButton("MATHURA");
	add(b4);
 }
}

public class color extends JPanel
{
 public color()
 {
 JCheckBox cb1 = new JCheckBox("Red");
 add(cb1);
 JCheckBox cb2 = new JCheckBox("Green");
 add(cb2);
 JCheckBox cb3 = new JCheckBox("Blue");
 add(cb3);
 
 }
}



}