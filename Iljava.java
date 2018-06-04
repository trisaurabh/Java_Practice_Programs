import javax.swing.*;

class Iljava{
    public static void main(String[] args){
	int i;
	//JFrame frame1=new JFrame();
	//frame1.setSize(400,300);
	//frame1.setVisible(true);
	for(i=1;i<10;i++){
	JOptionPane.showMessageDialog(null,"What is your name?\n My name is Saurabh\n You name is Sameer");
	}
	String input;
	input=JOptionPane.showInputDialog(null,"Enter text:\n Enter age\n Enter father's name");
	System.out.println(input);
	System.exit(0);
    }
}

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


class subframetest{
    public static void main(String[] args){
	subframe myframe;
	myframe=new subframe();
	framewithbutton myframe2;
	myframe2=new framewithbutton();
	
	
	myframe2.setVisible(true);
	myframe.setVisible(true);
    }
}


import javax.swing.*;

class Window{

    public static void main(String[] args){
	JFrame frame1;
	frame1=new JFrame();
	frame1.setVisible(true);
    }
}

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