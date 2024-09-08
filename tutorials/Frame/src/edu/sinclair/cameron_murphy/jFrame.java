package edu.sinclair.cameron_murphy;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class jFrame {
	public static void main(String [] args) {
		//create frame
	JFrame frame = new JFrame();
		//set frame size
	final int FRAME_WIDTH = 300;
	final int FRAME_HEIGHT = 400;
	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	frame.setTitle("An empty frame");
		//set default close option and make visible
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
		//add panel
	JPanel panel = new JPanel();
	JButton button = new JButton("CLICK ME!");
	JLabel label = new JLabel("HEllo, World!");
	panel.add(button);
	panel.add(label);
	frame.add(panel);
	
	//filled frame
	JFrame frameFill = new FilledFrame();
	frameFill.setTitle("A frame with 2 components");
	frameFill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameFill.setVisible(true);
	
	//event handling
	ActionListener listener = new ClickListener();
	button.addActionListener(listener);
	
	//implement another class with inner class
	JFrame investFrame = new InvestmentFrame();
	investFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	investFrame.setVisible(true);
	}
	
}
