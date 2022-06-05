import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Console extends JPanel implements ActionListener {
    boolean costil = true;
    JTextField input;
    JButton button;
    JTextArea output;
    Container container;
    Console(Main main){
        container = main.getContentPane();
        container.setLayout(new BorderLayout());

        input = new JTextField();
        input.setBounds(10, 10, 300, 30);
        input.addActionListener(this);
        input.setBackground(Color.black);
        input.setForeground(Color.cyan);
        container.add(input);

        output = new JTextArea("OutputArea");
        output.setBounds(10, 80 , 200 ,200);
        output.setBackground(Color.PINK);
        output.setForeground(Color.black);
        container.add(output);
        //output.setBackground(Color.white);

        button = new JButton("ButtonSuper");
        button.setBounds(10,40,200,30);
        button.setBackground(Color.orange);
        button.setForeground(Color.blue);
        button.addActionListener(this);
        container.add(button);
    }
    void plus(String newt){  // plus(input.getText(), output.getText())
        output.setText((newt)+"\n"+( output.getText()));
        input.setText("");
    }

    void risunoc(){
        plus("    &  /");
        plus("| 0  0 |");
        plus("/ |  / |");
        plus(" ^     ^");
    }

    public void actionPerformed(ActionEvent e) {
        //System.out.println(e.getActionCommand());
        output.setBounds(10, 80 , 200 ,500);
        //plus(input.getText());


        if(e.getSource().getClass() == JButton.class && input.getText().equals("ris")){
            risunoc();
        }
        if(!input.getText().equals("")){
            plus(input.getText());
        }

        if ((e.getActionCommand()=="SuperButton")|(e.getActionCommand()=="ButtonSuper")){
            if (costil){
                button.setText("SuperButton");
                costil = false;
            }
            else {
                button.setText("ButtonSuper");
                costil = true;
            }
        }

    }
}

