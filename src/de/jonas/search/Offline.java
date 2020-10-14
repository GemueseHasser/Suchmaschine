package de.jonas.search;

import javax.swing.*;
import java.awt.*;

public class Offline {

    public Offline() {
        JFrame frame = new JFrame("--Du bist offline--");
        frame.setBounds(0,0,600,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.requestFocus();

        JLabel label = new JLabel("Du bist Offline", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setBounds(0,80,600,100);

        frame.add(label);
        frame.setVisible(true);
    }

}
