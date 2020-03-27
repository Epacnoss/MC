package actual.overrides.ui;

import java.awt.*;
import java.awt.image.BufferedImage;

public class JBufferedImage extends BufferedImage {

    public JBufferedImage (int w, int h) {
        super(w, h, TYPE_INT_ARGB);
    }
    public JBufferedImage (int w, int h, int type) {
        super(w, h, type);
    }

    public JBufferedImage (Image img) {
        this(
                img.getWidth(null),
                img.getHeight(null)
        );

        drawImg(img);
    }
    public JBufferedImage (Image img, int w, int h) {
        this(img.getScaledInstance(w, h, SCALE_SMOOTH));
    }

    public void drawImg (Image img) {
        getGraphics().drawImage(img, 0, 0, null);
    }
    public void drawImg (Image img, int x, int y) {
        getGraphics().drawImage(img, x, y, null);
    }

    public static JBufferedImage clone (BufferedImage original) {
        JBufferedImage nu = new JBufferedImage(
                original.getWidth(),
                original.getHeight(),
                original.getType()
        );

        nu.getGraphics().drawImage(original, 0, 0, null);
        return nu;
    }

}
