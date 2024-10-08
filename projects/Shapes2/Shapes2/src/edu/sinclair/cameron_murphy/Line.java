package edu.sinclair.cameron_murphy;

import java.awt.*;

public class Line extends Shape {

    public Line() {
    }

    public Line(Point p1, Point p2, Color c) {
        super(p1, p2, c);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(getLineWidth()));

        g2.setColor(getColor());
        g2.drawLine(getP1().x, getP1().y, getP2().x, getP2().y);
    }
}
