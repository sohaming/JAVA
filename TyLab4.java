//Frame ---(without extends Frame)
import java.awt.*;
import java.applet.Applet;
class TyLab4
{
	TyLab4()
	{  
    //	setLayout(new FlowLayout(FlowLayout.RIGHT));                                                                                          
    //  setLayout(new FlowLayout(FlowLayout.LEFT));   
	//	setLayout(new GridLayout(3,2));
	//	setLayout(new GridLayout(3,2,100,200));
		Frame f=new Frame("Login Page");
		f.setBackground(Color.cyan);
		Label l1=new Label("Enter User Name ");
		f.add(l1);
	    TextField tf1=new TextField(10);
		f.add(tf1);
		
        Label l2=new Label("Enter Password ");
		f.add(l2);
		TextField tf2=new TextField(10);
		f.add(tf2);
	Button b1=new Button ("SUBMIT");
	Button b2=new Button ("CANCEL");
	f.add(b1);
	f.add(b2);
	
	//setLayout(new FlowLayout(FlowLayout.LEFT));
	//f.setLayout(new FlowLayout(FlowLayout.RIGHT));
	f.setLayout(new FlowLayout());
	f.setVisible(true);
	f.setSize(300,400); 
	
	}
	public static void main(String arg[])
	{
		new TyLab4();
	}
}


