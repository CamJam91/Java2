package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class SceneryFrame extends JFrame {
	//constructor
	public SceneryFrame(){
		JComponent ground = new SceneryComponent();
		add(ground);
	}
}
