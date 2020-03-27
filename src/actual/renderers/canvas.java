package actual.renderers;

import actual.objs.Block;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class canvas extends JComponent {

    private int rowNo;

    public canvas(Dimension size, int rowNo) {
        setPreferredSize(size);
        this.rowNo = rowNo;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 0, y = 0;
        ArrayList<Block> blocks;
    }
}
