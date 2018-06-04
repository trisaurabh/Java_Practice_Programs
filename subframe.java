import javax.swing.*;
import java.awt.*;

class subframe extends JFrame{
    private static final int fw=300;
    private static final int fh=200;
    private static final int fxo=150;
    private static final int fyo=250;

    public subframe(){
	setTitle("My first subclass");
	setSize(fw,fh);
	setLocation(fxo,fyo);

	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container contentPane=getContentPane();
	contentPane.setBackground(Color.YELLOW);
    }
}