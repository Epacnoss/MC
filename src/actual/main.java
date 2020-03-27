package actual;

import actual.objs.Block;
import actual.objs.BlockType;
import actual.renderers.canvas;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class main {
    private static Dimension overallSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static Dimension squaresNo = new Dimension(20, 10);
    private static Dimension blockSize;

    static {
        int blockWidth = Math.floorDiv(overallSize.width, squaresNo.width);
        int blockHeight = Math.floorDiv(overallSize.height, squaresNo.height);
        blockSize = new Dimension(blockWidth, blockHeight);
    }

    public static Dimension getOverallSize() {
        return overallSize;
    }

    public static int getBlockWidth () {
        return blockSize.width;
    }
    public static int getBlockHeight () {
        return blockSize.height;
    }

    public static int getBlocksNoWidth () {
        return squaresNo.width;
    }
    public static int getBlocksNoHeight () {
        return squaresNo.height;
    }

    public static void main(String[] args) {

        Random rnd = new Random();
        for (int i = 0; i < getBlocksNoWidth() * getBlocksNoHeight(); i++) {
            int typeInt = rnd.nextInt(3);
            BlockType typeEnum = BlockType.values()[typeInt];
            Block b = new Block(typeEnum);
        }

        JFrame jf = new JFrame("Shoddy MC");
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jf.setPreferredSize(overallSize);

        canvas c = new canvas();
        jf.add(c);
        jf.setVisible(true);
    }
}
