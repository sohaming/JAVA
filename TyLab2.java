//Applet ---(bydefault FlowLayout)
import java.awt.*;
import java.applet.Applet;
public class TyLab2 extends Applet
{
	public void init()
	{  
    //	setLayout(new FlowLayout(FlowLayout.RIGHT));                                                                                          
    //  setLayout(new FlowLayout(FlowLayout.LEFT));   
	//	setLayout(new GridLayout(3,2));
	//	setLayout(new GridLayout(3,2,100,200));
		
		Label l1=new Label("Enter User Name ");
		add(l1);
	    TextField tf1=new TextField(10);
		add(tf1);
		
        Label l2=new Label("Enter Password ");
		add(l2);
		TextField tf2=new TextField(10);
		add(tf2);
	Button b1=new Button ("SUBMIT");
	Button b2=new Button ("CANCEL");
	add(b1);
	add(b2);
	}
}

/*<applet code="TyLab2.class" width=200 height=300></applet>*/
