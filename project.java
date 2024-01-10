import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.applet.Applet;

class project extends JFrame
{
	
project()
{
	
	Font f=new Font("Free Ink",Font.BOLD,50);
setLayout(null);
Label tx=new Label("MSBTE SOLUTION");
tx.setBounds(500,50,500,100);
tx.setFont(f);

add(tx);
JPanel p1=new JPanel();
p1.setBounds(50,50,500,300);
p1.setLayout(new GridLayout(2,3));
p1.setBackground(Color.RED);
p1.setBounds(50,200,1400,500);
ImageIcon ii1=new ImageIcon("C:\\Users\\Soham's PC\\OneDrive\\Desktop\\JMAA\\pictures\\360_11.jpg");

	//JLabel l1= new JLabel(ii1);
	//l1.setBounds(50,50,180,180);

   //p1.add(l1);

for(int i=0;i<=6;i++)
{
	
	JLabel l1= new JLabel(ii1);
	l1.setBounds(50,50,400,200);

   p1.add(l1);
    
}

add(p1);
setVisible(true);
setSize(400,500);
}
public static void main(String args[])
{
new project();	
}
}
