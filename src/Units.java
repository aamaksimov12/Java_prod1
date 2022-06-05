import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;

//public class Units extends Pict implements Runnable{
public class Units extends Pict{
    String str;

    int count;

    /*Raster[] frames;
    BufferedImage img;
    int current = 0;
    //  */
    AnimatedImage ani;

    Units(String str, int x, int y, int w, int h, int count){
        this.str = str;
        this.w = w;
        this.h = h;
        this.x = x;
        this.y = y;
        this.count = count;
        ani = new AnimatedImage(str,count);
        img = ani.img;
       /* frames = new Raster[count];
        for(int i=0; i<count; i++){
            try {
                frames[i] = ImageIO.read(new File(str+(i+1)+".png")).getRaster();
            }
            catch (Exception e){
                System.out.println("no pictures" + (i+1));
            }
        }
        try {
            img = ImageIO.read(new File(str+"1.png"));
        } catch (Exception e){
            System.out.println("no pictures");
        }

        new Thread(this).start();
        // */
          /*
        setFocusable(true);
        requestFocus();
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                    moveImage(5,0);
                }
                if (e.getKeyCode()==KeyEvent.VK_LEFT){
                    moveImage(-5,0);
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    moveImage(0,5);
                }
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    moveImage(0,-5);
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        // */
    }
    public void moveImage(int dx, int dy) {
        x+=dx;
        y+=dy;
        Main.proxy.repaint();
    }
    /*
    public void run(){
        while (true){
            current++;
            current = current % frames.length;
            img.setData(frames[current]);
            //System.out.println(current);
            try {
                Thread.sleep(1000); //значение в миллисекундах, нужно зациклить
            } catch (Exception e){
                break;
            }
            if (!Main.proxy.isActive()){
                break;
            }
            Main.proxy.repaint();
        }
    }
    //  */
    @Override
    public void draw(Graphics g) {
        g.drawImage(img, x, y, w, h, null);
    }
}
