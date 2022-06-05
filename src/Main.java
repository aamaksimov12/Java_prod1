import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;


public class Main extends JFrame {
    static  Console myConsole;
    Units strazImage;

    Units skelImage;
    Pict grace;
    Pict test_strazh;
    Pict wingMill;
    RotatePict wings;
    Renderes render;
    AnimatedImage skel;


  //  Timer time = new Timer(3, this);
    Main(){
        super("Lab3_Test_№666");
        setSize(800,1000);
        setDefaultCloseOperation(2);
        setResizable(false);
        myConsole = new Console(this);
        myConsole.setBounds(0, 0, 300, 500);
        add(myConsole);
        grace = new Pict("src/grace.jpg", 350, 0, 600,500);
        wingMill = new Pict("src/WindMill.png",450,150,80,100);
        wings = new RotatePict("src/Wings.png",450,150,80,80,40);

        //strazImage = new Units("src/Walk", 450, 550,40, 40, 4);
        skelImage = new Units("src/sk",490,300,40,40,5);


        //skel = new AnimatedImage("src/sk",5);
        //test_strazh = new Pict("src/Walk2.png",450,500,60,60);
        //skelImage = new MyImage(skel.img, 380, 40, 60, 60);

        //myConsole.container.add(strazImage);
        //myConsole.container.add(skelImage);

        System.out.println("Controler: >, <, ^, v, space\n" );

        setVisible(true); //вывод окна
    }

    public static void main(String[] args){
        proxy = new Main();
    }

    static  Main proxy;

    static Renderes renderes = new Renderes();
    public  void paint(Graphics g){
        super.paint(g);
        renderes.draw(g);
    }
}
