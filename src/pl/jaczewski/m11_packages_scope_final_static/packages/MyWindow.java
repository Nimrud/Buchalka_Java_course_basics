package pl.jaczewski.m11_packages_scope_final_static.packages;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Wykorzystanie pakietów na podstawie java.awt (Abstract Window Toolkit)
public class MyWindow extends Frame {

    public MyWindow(String title){
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("Testowanie pakietu Java AWT", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("przeze mnie", 60, 100);
    }
}
