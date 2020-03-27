package actual.renderers;

import actual.main;
import actual.objs.Block;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class canvas extends JComponent {

    public canvas() {
        setPreferredSize(main.getOverallSize());
        paint(getGraphics());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int w = main.getBlockWidth(), h = main.getBlockHeight(), index = 0;
        ArrayList<Block> blocks = Block.getAll();

        for (int x = 0; x < main.getOverallSize().width; x += w) {
            for (int y = 0; y < main.getOverallSize().height; y += h) {
                if(index >= blocks.size()) break;

                Block b = blocks.get(index);
                index++;
                g.drawImage(b, x, y, null);
            }
            if(index >= blocks.size()) break;
        }
    }
}
