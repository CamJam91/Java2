package Cameron_Murphy;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComponent;

public class CaveFrame extends JFrame {
	private static final int FRAME_WIDTH = 1300;
	private static final int FRAME_HEIGHT = 1000;
	
		//constructor
	public CaveFrame() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
			//fonts
		Font instructionalFont = new Font("Times New Roman", Font.PLAIN, 32);
		Font buttonFont = new Font("Times New Roman", Font.PLAIN, 26);
			//sizes
		Dimension buttonSize = new Dimension(150,50);

			//create border and add components
		BorderLayout caveBorder = new BorderLayout();
			//North component (instructions)
		JLabel instructionsLB = new JLabel("The Diver begins in the upper left corner and escapes by reaching the lower-right corner.");
		instructionsLB.setFont(instructionalFont);
		instructionsLB.setBackground(null);
		add(instructionsLB, BorderLayout.NORTH);
		instructionsLB.setHorizontalAlignment(SwingConstants.CENTER);
		
			//South Component (text area and buttons)
		JLabel depthLB = new JLabel("Enter the diver's depth rating: ");
		depthLB.setFont(instructionalFont);
		TextField ratingTF = new TextField();
		ratingTF.setPreferredSize(buttonSize);
		ratingTF.setFont(instructionalFont);
		JButton escapeBTN = new JButton("Escape");
		escapeBTN.setFont(buttonFont);
		escapeBTN.setPreferredSize(buttonSize);
		JButton caveBTN = new JButton("New Cave");
		caveBTN.setPreferredSize(buttonSize);
		caveBTN.setFont(buttonFont);
		JPanel southPanel = new JPanel();
		southPanel.add(depthLB);
		southPanel.add(ratingTF);
		southPanel.add(escapeBTN);
		southPanel.add(caveBTN);
		add(southPanel, BorderLayout.SOUTH);
		
			//Center Component (cave component)
		CaveComponent cave = new CaveComponent();
		add(cave, BorderLayout.CENTER);
		
			//button actions
		caveBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				cave.randomize();
				repaint();
			}
		});
		escapeBTN.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				int level = Integer.valueOf(ratingTF.getText()); //get level value from user
					//call cave components escape that calls caves escape
				boolean popUp = cave.escapeInitiate(level);
				repaint();
				if (popUp) { JOptionPane.showMessageDialog(null, "An escape was found!");}
				else {JOptionPane.showMessageDialog(null, "No escape was found.");}
			}
		});
	}

}
