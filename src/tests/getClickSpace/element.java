package tests.getClickSpace;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class element extends BufferedImage {

    private Color[] cols;
    private int index;

    public element(int width, int height, Color[] colours) {
        super(width, height, TYPE_INT_RGB);
        cols = colours;

        index = new Random().nextInt(cols.length);
        drawRectJack(0, 0, width, height, colours[index]);
        index++;
    }
    
    public void drawRectJack (int xPos, int yPos, int w, int h, Color c) {
        int rgb = c.getRGB();
        for (int x = xPos; x < w; x++)
            for (int y = yPos; y < h; y++)
                setRGB(x, y, rgb);
    }

    public void change () {
        if(index >= cols.length)
            index = 0;

        drawRectJack(0, 0, getWidth(), getHeight(), cols[index]);
        index++;
    }
}
