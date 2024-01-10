import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class test1 implements ActionListener
{
	JPanel p1,wes;
	JButton b1,b2,b3,b4;
	
	test1()
	{	
		JFrame f=new JFrame("time");
		
		JPanel wes=new JPanel();
		wes.setLayout(new GridLayout(4,1));
		
		f.setLayout(new BorderLayout());
		b1=new JButton("BLUE");
		wes.add(b1,BorderLayout.WEST);
		b2=new JButton("BLUE");
		wes.add(b2,BorderLayout.WEST);
		b3=new JButton("BLUE");
		wes.add(b3,BorderLayout.WEST);
		b4=new JButton("BLUE");
		wes.add(b4,BorderLayout.WEST);
	
		b1.addActionListener(this); 
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		p1=new JPanel();
		p1.setBackground(Color.black);
		f.add(p1,BorderLayout.CENTER);
		
			
		f.add(wes,BorderLayout.WEST);
		f.setSize(600,600);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand()==("BLUE"))
		{
			p1.setBackground(Color.RED);
			p1.repaint();
		}		
		if(e.getActionCommand()==("BLUE"))
		{
			p1.setBackground(Color.YELLOW);
			p1.repaint();
		}
		if(e.getActionCommand()==("BLUE"))
		{
			p1.setBackground(Color.BLUE);
			p1.repaint();
		}
		if(e.getActionCommand()==("BLUE"))
		{
			p1.setBackground(Color.ORANGE);
			p1.repaint();
		}
	}
	public static void main(String ar[])
	{
		new test1();
	}
}