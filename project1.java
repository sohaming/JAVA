import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.applet.Applet;

class project1 extends JFrame
{
	project1()
	{
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setBounds(50,50,500,300);
		p1.setLayout(new GridLayout(2,3));
		ImageIcon ii1=new ImageIcon("C:\\Users\\Soham's PC\\OneDrive\\Desktop\\JMAA\\pictures\\360_11");
		ImageIcon ii2=new ImageIcon("C:\\Users\\Soham's PC\\OneDrive\\Desktop\\JMAA\\pictures\\9f1a86a3aab3064768fa2d80bdc8689f");
		for(int i=0;i<=5;i++)
		{
			JLabel l1=new JLabel(ii1);
			JLabel l1=new JLabel(ii2);
			p1.add(l1);
			p1.add(l2);
		}	
		
		add(p1);
		setSize(700,600);
		setVisible(true);
	}
	public static void main(String args[])	
	{
		new project1();	
	}
}
