package actual.objs;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Block extends BufferedImage implements ISingletonCompatibleObj {

    private static Dimension wh = new Dimension(0, 0);
    private static ArrayList<Block> blocks = new ArrayList<>();
    private Color c;
    private static BlockType blockType;

    public static void setwh (Dimension nu) {
        wh = nu;
    }

    public Block(BlockType b) {
        b

        super(wh.width, wh.height, TYPE_INT_ARGB);
        this.c = c;
        getGraphics().setColor(c);
        getGraphics().fillRect(0, 0, wh.width, wh.height);

        OnStart();
    }

    @Override
    public void OnStart() {
        blocks.add(this);
    }

    @Override
    public void OnEnd() {
        blocks.remove(this);
    }

    @Override
    public ArrayList<Block> getAll() {
        return blocks;
    }
}
