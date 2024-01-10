//Frame +Panel---(without extends Frame-by using setBounds())
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
class TyLab11
{
	TyLab11()
	{  
		JFrame f=new JFrame("Login Page");
		f.setBackground(Color.cyan);
		
        
		Font f11=new Font("Ink Free",Font.BOLD,20);
		
		JPanel p=new JPanel();
		p.setFont(f11);
		p.setLayout(null);
		p.setBounds(500,50,550,600);
		p.setBackground(Color.yellow);
		
		JLabel l1=new JLabel("Enter User Name ");
		l1.setBounds(100,40,200,30);
		p.add(l1);
	    
		JTextField tf1=new JTextField(10);
		tf1.setBounds(320,40,200,30);
		p.add(tf1);
		
        JLabel l2=new JLabel("Enter Password ");
		l2.setBounds(100,120,200,30);
		p.add(l2);
		
		JPasswordField tf2=new JPasswordField(10);
		
		tf2.setBounds(320,120,200,30);
		p.add(tf2);
	JButton b1=new JButton ("SUBMIT");
	JButton b2=new JButton ("CANCEL");
	 b1.setBounds(200,200,100,30);
	b2.setBounds(330,200,100,30);
	p.add(b1);
	p.add(b2);
	
	f.setLayout(null);  
    f.add(p);
	f.setVisible(true);
	f.setSize(620,400); 
	
	}
	public static void main(String arg[])
	{
		new TyLab11();
	}
}


