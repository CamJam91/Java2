package edu.sinclair.cameron_murphy;

import javax.swing.JFrame;

public class HouseViewer {
	public static void main(String [] args) {
		//create frame
	JFrame frame = new HouseFrame();
	frame.setSize(1000,1000);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
}
