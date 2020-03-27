package actual.util;

import actual.overrides.ui.JBufferedImage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

public class ResourceManager {

    public static final String BASE_URL = "https://raw.githubusercontent.com/Epacnoss/MC/master/MCAssets/";
    public static final String BLOCKS_URL = BASE_URL + "blocks/";

    private static HashMap<URL, JBufferedImage> imgs = new HashMap<>();

    public static JBufferedImage getImg (URL url) {
        if(imgs.containsKey(url))
            return JBufferedImage.clone(imgs.get(url));

        Image img = null;
        try {
            img = ImageIO.read(url);
            imgs.put(url, new JBufferedImage(img));
        } catch (IOException e) {
            return new JBufferedImage(100, 100); //TODO: Fix width and height to sync with other blocks
        }
        
        return new JBufferedImage(img);
    }
}
