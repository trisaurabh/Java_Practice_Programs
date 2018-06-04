import javax.swing.*;
import java.awt.*;

class framewithbutton extends JFrame{
    private static final int fw=300;
    private static final int fh=200;
    private static final int fxo=150;
    private static final int fyo=250;

    public framewithbutton(){
	setTitle("Frame with Buttons");
	setSize(fw,fh);
	setLocation(fxo,fyo);

	JButton cancel=new JButton("CANCEL");
	JButton ok=new JButton("OK");

	Container contentPane=getContentPane();
	contentPane.setLayout(new FlowLayout());

	contentPane.add(ok);
	contentPane.add(cancel);



	setDefaultCloseOperation(EXIT_ON_CLOSE);
	contentPane.setBackground(Color.BLUE);
    }
}