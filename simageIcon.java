/*import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.applet.Applet;

class simageIcon extends JFrame
{
	
simageIcon()
{
setLayout(null);
//setLayout(new FlowLayout());
//ImageIcon ii1=new ImageIcon("C:\\Users\\Soham's PC\\OneDrive\\Desktop\\JMAA\\pictures\\th(7).jpg");
ImageIcon ii1=new ImageIcon("th.jpg");
JLabel l1= new JLabel(ii1);
l1.setBounds(144,200,700,100);
JButton b1=new JButton("SUBMIT");
b1.setBounds(344,400,100,100);
add(b1);
add(l1);

setVisible(true);
setSize(400,500);
}
public static void main(String args[])
{
new simageIcon();	
}
}
*/


import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.applet.Applet;

class simageIcon extends JFrame
{
	
simageIcon()
{
setLayout(new FlowLayout());
//ImageIcon ii1=new ImageIcon("C:\\Users\\Soham's PC\\OneDrive\\Desktop\\JMAA\\pictures\\th(7).jpg");
ImageIcon ii1=new ImageIcon("th.jpg");
JLabel l1= new JLabel(ii1);
JButton b1=new JButton("SUBMIT");

add(b1);
add(l1);

setVisible(true);
setSize(400,500);
}
public static void main(String args[])
{
new simageIcon();	
}
}
