//Frame +Panel---(without extends Frame-by using setBounds())
import java.awt.*;
import java.applet.Applet;
class form1
{
	form1()
	{  
		Frame f=new Frame("Login Page");
		f.setBackground(Color.cyan);
		f.setLayout(null);
	

        Panel p11=new Panel();
		p11.setLayouts(null);
     	MenuBar mbar=new MenuBar();
		p11.setMenuBar(mbar);
	    p11.setBounds(1,110,1700,80) ;
	
		Menu fm=new Menu("File");
		Menu em=new Menu("Edit");
	
		mbar.add(fm);
		mbar.add(em);
	
		MenuItem n=new MenuItem("New");
		MenuItem o=new MenuItem("Open");
		MenuItem s=new MenuItem("Save");
 
 
		fm.add(n);
		fm.add(o);
		fm.add(s);
		
        
		Font f11=new Font("Ink Free",Font.BOLD,20);
		Panel p1=new Panel();
		p1.setFont(f11);
		p1.setLayout(null);
		p1.setBounds(1,30,1700,80);
		p1.setBackground(Color.red);
		Label l3=new Label("LOGIN-FORM! ");
		l3.setForeground(Color.yellow);
		l3.setBounds(700,30,200,50);
		p1.add(l3);
		
		Panel p=new Panel();
		p.setFont(f11);
		p.setLayout(null);
		p.setBounds(500,150,550,600);
		p.setBackground(Color.yellow);
		
		Label l1=new Label("Enter User Name ");
		l1.setBounds(80,40,200,30);
		p.add(l1);
	    
		TextField tf1=new TextField(10);
		tf1.setBounds(320,40,200,30);
		p.add(tf1);
		
        Label l2=new Label("Enter Password ");
		l2.setBounds(80,120,200,30);
		p.add(l2);
		
		TextField tf2=new TextField(10);
		tf2.setEchoChar('*');
		tf2.setBounds(320,120,200,30);
		p.add(tf2);
	Button b1=new Button ("SUBMIT");
	Button b2=new Button ("CANCEL");
	 b1.setBounds(150,200,100,30);
	b2.setBounds(330,200,100,30);
	p.add(b1);
	p.add(b2);
	
	f.setLayout(null);
	f.add(p11);
	f.add(p1);
    f.add(p);
	f.setVisible(true);
	f.setSize(620,400); 
	
	}
	public static void main(String arg[])
	{
		new form1();
	}
}


