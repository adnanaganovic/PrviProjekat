package seven.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Prozor {
    private JFrame frame;
    private JTextField textField;
    private JButton addbutton;
    private JButton printButton;
    private ArrayList<String> names = new ArrayList<>();

    public Prozor() {
        this.frame = new JFrame("Prozor u Java svijet");
        this.textField = new JTextField("Unesi ime");
        this.addbutton = new JButton("Dodaj");
        this.printButton = new JButton("Print");

//        public void dodaj(){
//            String text = textField.getText();
//            names.add(text);
//            textField.setText("");
//        }

        Container container = frame.getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(textField);
        container.add(addbutton);
        container.add(printButton);
    }
        public void setDimension ( int width, int height){
            frame.setSize(width,height);
        }
           public void show() {
            frame.setVisible(true);
        }


    }


