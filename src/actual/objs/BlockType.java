package actual.objs;

import actual.overrides.ui.JBufferedImage;
import actual.util.ResourceManager;

import java.net.URL;

public enum BlockType {

    stone (64),
    dirt (64),
    wood (64);

    private int max;

    BlockType(int max) {
        this.max = max;
    }

    int getMax () {
        return max;
    }

    public static JBufferedImage getImg (BlockType b) {
        try {
            switch (b) {
                case dirt:
                    URL urlD = new URL(ResourceManager.BLOCKS_URL + "dirt.png");
                    return ResourceManager.getImg(urlD);
                case wood:
                    URL urlW = new URL(ResourceManager.BLOCKS_URL + "wood.png");
                    return ResourceManager.getImg(urlW);
                case stone:
                    URL urlS = new URL(ResourceManager.BLOCKS_URL + "stone.png");
                    return ResourceManager.getImg(urlS);
            }
        } catch (Exception e) {
            return new JBufferedImage(100, 100); //TODO: Sync width and height
        }

        return new JBufferedImage(100, 100); //TODO: Sync width and height
    }

}
