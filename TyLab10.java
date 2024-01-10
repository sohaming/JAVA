//Applet ---(bydefault FlowLayout)
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
public class TyLab10 extends JApplet
{
	public void init()
	{  
    //	setLayout(new FlowLayout(FlowLayout.RIGHT));                                                                                          
    //  setLayout(new FlowLayout(FlowLayout.LEFT));   
	//	setLayout(new GridLayout(3,2));
	//	setLayout(new GridLayout(3,2,100,200));
		
		JLabel l1=new JLabel("Enter User Name ");
		add(l1);
	    JTextField tf1=new JTextField(10);
		add(tf1);
		
        JLabel l2=new JLabel("Enter Password ");
		add(l2);
		JTextField tf2=new JTextField(10);
		add(tf2);
	JButton b1=new JButton ("SUBMIT");
	JButton b2=new JButton ("CANCEL");
	add(b1);
	add(b2);
	}
}

/*<applet code="TyLab10.class" width=200 height=300></applet>*/
