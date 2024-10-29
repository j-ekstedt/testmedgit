package Tmg;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class b extends JFrame {
    JPanel panel = new JPanel();
    JButton button1 = new JButton("Button1");
    JButton button = new JButton("Button2");
    b(){
        button.addActionListener(buttonClicked -> System.out.println("klickad"));
        button1.addActionListener(new ActionListener() {                         // Anonym klass variant.
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("knapp2 klickad");
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("BBBBB");

    }
}
