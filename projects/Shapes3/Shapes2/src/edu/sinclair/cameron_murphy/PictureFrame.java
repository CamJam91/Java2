package edu.sinclair.cameron_murphy;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PictureFrame extends JFrame {
	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;
	private Point upperLeft = new Point(300, 10);
	
	private CanvasComponent scene;
	private JPanel panel;
	
	class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent mEvent) {
			scene.createShape(mEvent.getPoint());
		}
		
		@Override
		public void mouseDragged(MouseEvent mEvent) {
			scene.dragShape(mEvent.getPoint());
		}
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent kEvent) {
			scene.processKeys(kEvent.getKeyChar());
		}
	}
	
		//constructor
	public PictureFrame() {
		scene = new CanvasComponent();
		MouseAdapter listener = new MyMouseListener();
		scene.addMouseListener(listener);
		scene.addMouseMotionListener(listener);
		
		KeyAdapter keyListener = new MyKeyListener();
		scene.addKeyListener(keyListener);
		scene.setFocusable(true);
		
		JLabel keyGuide = new JLabel();
		keyGuide.setText("(E)rase (T)rails (L)ine (B)ox (O)val (C)olor (S)ave (R)estore");
        keyGuide.setFont(new Font("Ariel", Font.PLAIN, 24));
        keyGuide.setHorizontalAlignment(SwingConstants.CENTER);

        panel = new JPanel();
        panel.setLayout(new BorderLayout()); //five sections N,S,E,W,C
        panel.add(keyGuide, BorderLayout.SOUTH);
        panel.add(scene, BorderLayout.CENTER);

        add(panel);
        setTitle("Simple GUI");

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(upperLeft);
	}
}
