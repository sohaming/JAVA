import java.awt.*;
import java.awt.MenuBar;
import java.applet.Applet;

class menu extends Frame
{
public static void main(String args[])
 {
	menu mm1=new menu();
	
	mm1.setVisible(true);
	mm1.setSize(400,400);
	
	MenuBar mbar=new MenuBar();
	mm1.setMenuBar(mbar);
	
	Menu fm=new Menu("File");
	Menu em=new Menu("Edit");
	Menu sm=new Menu("Search");
	Menu vm=new Menu("View");
	Menu Em=new Menu("Encoding");
	Menu lm=new Menu("Launguage");
	Menu Sm=new Menu("Settings");
	Menu Tm=new Menu("Tools");
	Menu mm=new Menu("Marco");
	Menu rm=new Menu("Run");
	Menu Pm=new Menu("Plugins");
	Menu Wm=new Menu("Window");
	Menu qm=new Menu("?");
	mbar.add(fm);
	mbar.add(em);
	mbar.add(sm);
	mbar.add(vm);
	mbar.add(Em);
	mbar.add(lm);
	mbar.add(Sm);
	mbar.add(Tm);
	mbar.add(mm);
	mbar.add(rm);
	mbar.add(Pm);
	mbar.add(Wm);
	mbar.add(qm);
	
	MenuItem a=new MenuItem("New");
	MenuItem b=new MenuItem("Open");
	MenuItem c=new MenuItem("Open in Containing Folder");
	MenuItem d=new MenuItem("Save");
	MenuItem e=new MenuItem("Save as");
	MenuItem f=new MenuItem("Rename");
	MenuItem g=new MenuItem("Close");
	MenuItem h=new MenuItem("close All");
	MenuItem i=new MenuItem("Move To Recycle Bin");
	MenuItem j=new MenuItem("Session");
	MenuItem k=new MenuItem("Load Session");
	MenuItem l=new MenuItem("Save Session");
	MenuItem m=new MenuItem("Print");
	MenuItem n=new MenuItem("Load All deleted Files");
	MenuItem o=new MenuItem("End All Files");
	MenuItem p=new MenuItem("Exit");
 
 
	fm.add(a);
	fm.add(b);
	fm.add(c);
	fm.add(d);
	fm.add(e);
	fm.add(f);
	fm.add(g);
	fm.add(h);
	fm.add(i);
	fm.add(g);
	fm.add(k);
	fm.add(l);
	fm.add(m);
	fm.add(n);
	fm.add(o);
	fm.add(p);

}

}
