package actual.objs;

import actual.overrides.ui.JBufferedImage;

import java.awt.*;
import java.util.ArrayList;

public class Block extends JBufferedImage implements ISingletonCompatibleObj {

    private static Dimension wh = new Dimension(0, 0);
    private static ArrayList<Block> blocks = new ArrayList<>();
    private static BlockType blockType;

    public static void setwh (Dimension nu) {
        wh = nu;
    }

    public Block(BlockType b) {
        super(BlockType.getImg(b), wh.width, wh.height);
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

    public static ArrayList<Block> getAll() {
        return blocks;
    }
}
