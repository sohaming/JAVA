import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
class TyLab12 extends JFrame
{
	TyLab12()
	{  
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		for(int i=1;i<=20;i++)
		{
		JButton b1=new JButton(""+i);
		add(b1);
		
		}
		//setResizable(false);
		setVisible(true);
		setSize(400,500);
		pack();
	
	}
	public static void main(String arg[])
	{
		new TyLab12();
	}
}


