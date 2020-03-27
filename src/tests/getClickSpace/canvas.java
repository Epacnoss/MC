package tests.getClickSpace;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class canvas extends JComponent {

    private Color[] cols = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.RED};

    private int resX, noX;
    private int resY, noY;
    private element[][] elements;
    private mouseListener ml;

    public canvas(int noX, int noY, Dimension wh) {
        setPreferredSize(wh);

        resX = Math.floorDiv(wh.width, noX);
        resY = Math.floorDiv(wh.height, noY);
        this.noX = noX;
        this.noY = noY;

        elements = new element[noX][noY];

        for(int xArr = 0; xArr < noX; xArr++) {
            for (int yArr = 0; yArr < noY; yArr++) {
                elements[xArr][yArr] = new element(resX, resY, cols);
            }
        }

        ml = new mouseListener(this);
    }

    public mouseListener getMl () {
        return ml;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 0;
        int y = 0;

        for(int xArr = 0; xArr < noX; xArr++) {
            for (int yArr = 0; yArr < noY; yArr++) {
                element e = elements[xArr][yArr];
                g.drawImage(e, x, y, null);
                x += resX;
            }
            y += resY;
            x = 0;
        }
    }

    public void change (MouseEvent e) {
        int xArr = Math.floorDiv(e.getXOnScreen(), resX);
        int yArr = Math.floorDiv(e.getYOnScreen(), resY);
        elements[xArr][yArr].change();
        System.out.println(e.toString());
    }
}
