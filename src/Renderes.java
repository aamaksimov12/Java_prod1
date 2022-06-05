import java.awt.*;
import java.util.ArrayList;

public class Renderes {
    /*
    AnimatedImage[]img;
    ArrayList<AnimatedImage> img_list = new Array <> (10);
    img_list = at(i)
    for(AnimatedImage image: img_list){
        g.drowImage(image.img, image.x, image.y, image.h, image.w, null);
        }
    */

    ArrayList<Pict> pictures = new ArrayList<>(10);

    public void draw(Graphics g){
        for (Pict pic : pictures)
            pic.draw(g);
    }
}
