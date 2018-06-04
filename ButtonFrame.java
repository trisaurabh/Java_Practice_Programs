import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrame extends JFrame implements WindowListener{
    
    private Container contentPane;
    
    public ButtonFrame(){
	setTitle("ButtonTest");
	setSize(300,200);
	addWindowListener(this);
	
	contentPane = this.getContentPane();
	contentPane.add(new ButtonPanel());
    }
    

    public void windowClosing(WindowEvent e){
	System.exit(0);
    }
    public void windowActivated(WindowEvent e){}
    
    public void windowClosed(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    
    
}