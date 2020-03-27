package tests.getClickSpace;

import javax.swing.*;
import java.awt.*;

public class clickTest {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Click Tester");
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setPreferredSize(size);

        canvas c = new canvas(20, 20, size);
        jf.add(c);
        jf.addMouseListener(c.getMl());
        jf.setVisible(true);
    }

}
