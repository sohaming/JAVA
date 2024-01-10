import java.awt.*;  
import javax.swing.*;  
public class PanelExample {  
     PanelExample()  
        {  
		ImageIcon ii=new ImageIcon("banner-1176676_1280.jpg");
		ii.setBounds(10,10,1080,235);
		f.add(ii);
		
        JFrame f= new JFrame("Panel Example");    
        JPanel panel=new JPanel();
		panel.setLayout(null);
        panel.setBounds(500,80,500,500);    
        panel.setBackground(Color.gray);  
        JButton b1=new JButton("SUBMIT");     
        b1.setBounds(100,300,85,30);    
        b1.setBackground(Color.yellow);   
        JButton b2=new JButton("CANCEL");   
        b2.setBounds(300,300,85,30);    
        b2.setBackground(Color.red);   
        panel.add(b1); panel.add(b2);  
        f.add(panel);  
                f.setSize(400,400);    
                f.setLayout(null);    
                f.setVisible(true);    
        }  
        public static void main(String args[])  
        {  
        new PanelExample();  
        }  
    }  