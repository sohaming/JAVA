//Frame +Panel---(without extends Frame-by using setBounds())
import java.awt.*;
import java.applet.Applet;
class TyLab6
{
	TyLab6()
	{  
		Frame f=new Frame("Login Page");
		//f.setBackground(Color.cyan);
        
		Font f11=new Font("Ink Free",Font.BOLD,20);
		
		Panel p=new Panel();
		p.setFont(f11);
		p.setLayout(null);
		p.setBounds(500,50,550,600);
		p.setBackground(Color.yellow);
		
		Label l1=new Label("Enter User Name ");
		l1.setBounds(100,40,200,30);
		p.add(l1);
	    
		TextField tf1=new TextField(10);
		tf1.setBounds(320,40,200,30);
		p.add(tf1);
		
        Label l2=new Label("Enter Password ");
		l2.setBounds(100,120,200,30);
		p.add(l2);
		
		TextField tf2=new TextField(10);
		tf2.setEchoChar('*');
		tf2.setBounds(320,120,200,30);
		p.add(tf2);
	Button b1=new Button ("SUBMIT");
	Button b2=new Button ("CANCEL");
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
		new TyLab6();
	}
}


