import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;

public class Pict extends JPanel{
    Image img;
    String name;
    int w;
    int h;
    int x;
    int y;
    Pict(){

    }
    Pict(String name, int x, int y, int w, int h) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        img = new ImageIcon(name).getImage();
        Main.renderes.pictures.add(this);

    }


    public void draw(Graphics g) {
       g.drawImage(img, x, y, w, h, null);
    }
}




