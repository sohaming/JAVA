import java.awt.*;
import java.applet.Applet;

public class abc extends Applet
{
	public void init()
	{
	Frame f=new Frame();
	f.setLayout(null);	
	
	Label l1=new Label("Type Here");
	f.add(l1);
	f.setBounds(300,350,50,50);
	
	f.setVisible(true);
	f.setSize(600,610);
	
	}
	
}
/*<applet class="abc.class" width=600 height=700></applet>*/