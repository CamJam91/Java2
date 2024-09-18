import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
   This component displays a rectangle that can be moved.
*/
public class RectangleComponent2 extends JComponent
{
   private static final int RECTANGLE_WIDTH = 20;
   private static final int RECTANGLE_HEIGHT = 30;

   private int xLeft;
   private int yTop;

   public RectangleComponent2()
   {
      xLeft = 0;
      yTop = 0;
   }

   public void paintComponent(Graphics g)
   {
      g.fillRect(xLeft, yTop, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
   }

   /**
      Moves the rectangle to the given location.
      @param x the x-position of the new location
      @param y the y-position of the new location
   */
   public void moveRectangleTo(int x, int y)
   {
      xLeft = x;
      yTop = y;
      repaint();
   }
}