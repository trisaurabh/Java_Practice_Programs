import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonPanel extends JPanel implements ActionListener{

    private JButton redButton;
    private JButton blueButton;

    public ButtonPanel(){
	redButton = new JButton("Red");
	blueButton = new JButton("Blue");
	redButton.addActionListener(this);
	blueButton.addActionListener(this);
	add(redButton);
	add(blueButton);
    }

    public void actionPerformed(ActionEvent evt){
	Color color = getBackground();
	if(color!=Color.red){       	
	setBackground(Color.red);
	}
	else{
	    if(color!=Color.blue){
	    setBackground(Color.blue);
	    }
	    else{
		setBackground(Color.blue);
	    }
	}
    }
}