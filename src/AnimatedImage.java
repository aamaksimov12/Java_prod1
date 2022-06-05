import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;

class AnimatedImage implements  Runnable{
    Raster[] frames;
    BufferedImage img;
    int current = 0;

    AnimatedImage(String path, int count){
        //FileReader in = new FileReader();
        frames = new Raster[count];
        for(int i=0; i<count; i++){
            try {
                frames[i] = ImageIO.read(new File(path+(i+1)+".png")).getRaster();
            }
            catch (Exception e){
                System.out.println("no pictures" + (i+1));
            }
        }
        try {
            img = ImageIO.read(new File(path+"1.png"));
        } catch (Exception e){
            System.out.println("no pictures");
        }

        new Thread(this).start();
    }
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
}