package edu.sinclair.cameron_murphy;
import java.awt.*;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import java.util.ArrayList;
import java.util.List;

public class CanvasComponent extends JComponent {

    private enum ShapeType{
        LINE, BOX, OVAL;
    };
    private ShapeType currentShape;
    private Color currentColor;
    private List<Shape> shapes;
    private Point startPoint;
    private boolean drawTrails;
    public CanvasComponent() {
        shapes = new ArrayList<>();
        startPoint = new Point(0,0);
        currentShape =  ShapeType.LINE;
        currentColor = Color.BLACK;
        drawTrails = false;
    }

    public void paintComponent(Graphics g) {
        for (Shape s : shapes){
            s.draw(g);
        }
    }

    public void createShape(Point p){
        startPoint = p;
        addShape(p);
        repaint();
    }

    /**
     * Constructs the appropriate shape
     * @param p
     */
    public void addShape(Point p){
    	switch (currentShape) {
    	case ShapeType.LINE: 
    		shapes.add(new Line(startPoint, p, currentColor));
    		break;
    	case ShapeType.BOX:
    		shapes.add(new Box(startPoint, p, currentColor));
    		break;
    	case ShapeType.OVAL:
    		shapes.add(new Oval(startPoint, p, currentColor));
    		break;
    	}
    }

    public void dragShape(Point p){
        if (drawTrails){
            addShape(p);
            repaint();
        }else{
            shapes.get(shapes.size()-1).setP2(p); //set endpoint for final shape to be repainted
            repaint();
        }
    }

    public void processKeys(char key){
        switch(Character.toLowerCase(key)){
            case 'b':
            	currentShape = ShapeType.BOX;
                break;
            case 'l':
            	currentShape = ShapeType.LINE;
                break;
            case 'o':
            	currentShape = ShapeType.OVAL;
                break;
            case 'e':
                shapes.clear();
                repaint();
                break;
            case 't':
                drawTrails = !drawTrails;
                break;
            case 'c':
                currentColor = JColorChooser.showDialog(null, "Choose a shape color", currentColor);
            default: //consider error processing
                break;
        }
    }
    
}