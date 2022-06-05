import java.awt.*;
import java.awt.geom.AffineTransform;

public class RotatePict extends Pict{
    int angle;
    RotatePict(String name, int x, int y, int w, int h,int angle){
        super(name, x, y, w, h);
        this.angle = angle;
    }
    @Override
    public void draw(Graphics g) {
       //переопределить этот метод в дочернем классе для поворота
        Graphics2D g2d = (Graphics2D)g;
        AffineTransform affineTransform = g2d.getTransform();
        affineTransform.rotate(Math.toRadians(angle),x+w/2 , y+h/2);
        g2d.setTransform(affineTransform);
        g.drawImage(img, x, y, w, h, null);
        affineTransform.rotate(Math.toRadians(-angle),x+w/2 , y+h/2);
        g2d.setTransform(affineTransform);
    }
}
