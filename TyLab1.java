import java.awt.*;
import java.applet.Applet;
public class TyLab1 extends Applet

{
public void init()
{
	 Font ff=new Font("Arial",Font.BOLD,24);
	 setFont(ff);
}
	public void paint(Graphics g)
	{   
	    
	    g.drawString("All Shapes",100,20);
		g.drawLine(100,200,200,300);
		g.drawOval(100,200,50,30);
		g.setColor(Color.pink);
		g.fillOval(300,200,50,30);
	}
	
}
/*<applet code="TyLab1.class" width=700 height=500></applet>*/
