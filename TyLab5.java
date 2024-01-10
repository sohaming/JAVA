//Frame ---(without extends Frame-by using setBounds())
import java.awt.*;
import java.applet.Applet;
class TyLab5
{
	TyLab5()
	{  
		Frame f=new Frame("Login Page");
		f.setBackground(Color.cyan);
        f.setLayout(null);  
		
		Label l1=new Label("Enter User Name ");
		l1.setBounds(100,70,200,50);
		f.add(l1);
	    
		TextField tf1=new TextField(10);
		tf1.setBounds(320,70,200,50);
		f.add(tf1);
		
        Label l2=new Label("Enter Password ");
		l2.setBounds(100,150,200,50);
		f.add(l2);
		
		TextField tf2=new TextField(10);
		tf2.setBounds(320,150,200,50);
		f.add(tf2);
	Button b1=new Button ("SUBMIT");
	Button b2=new Button ("CANCEL");
	 b1.setBounds(200,230,100,50);
	b2.setBounds(330,230,100,50);
	f.add(b1);
	f.add(b2);
	

	f.setVisible(true);
	f.setSize(600,400); 
	
	}
	public static void main(String arg[])
	{
		new TyLab5();
	}
}


