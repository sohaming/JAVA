import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.applet.Applet;

class imgh extends JFrame
{
	
imgh()
{
//setLayout(new FlowLayout());
ImageIcon ii1=new ImageIcon("th.jpg");
setBounds(144,200,100,100);



setLayout(null);
setVisible(true);
setSize(400,500);
}
public static void main(String args[])
{
new imgh();	
}
}
