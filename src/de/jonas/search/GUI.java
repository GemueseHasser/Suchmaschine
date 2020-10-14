package de.jonas.search;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GUI {

    public static JTextField Field;

    private static Font font = new Font("Arial", Font.BOLD, 20);

    public GUI() {
        JFrame frame = new JFrame("Suchmaschine");
        frame.setBounds(0,0,600,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.requestFocus();
        frame.addKeyListener(new KeyHandler());

        Font Headingfont = new Font("Arial", Font.BOLD, 50);

        JLabel label = new JLabel("<html><a style=\"color: blue;\">A<a style=\"color: red;\">D<a style=\"color: yellow;\">L<a style=\"color: blue;\">E<a style=\"color: green;\">R</a>");
        label.setFont(Headingfont);
        label.addKeyListener(new KeyHandler());
        label.setBounds(190,20,200,60);

        JTextField field = new JTextField();
        field.setFont(font);
        field.setBounds(20,120,400,40);
        field.addKeyListener(new KeyHandler());

        JButton button = new JButton("Suchen");
        button.setFont(font);
        button.setBounds(425,120,120,40);
        button.setOpaque(true);
        button.setBackground(Color.LIGHT_GRAY);
        button.setForeground(Color.WHITE);
        button.addKeyListener(new KeyHandler());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(field.getText().equalsIgnoreCase("tauchen")) {
                        URI uri = new URL("http://beefman.bplaced.net/tauchenMain.html").toURI();
                        Desktop.getDesktop().browse(uri);
                        field.setText("");
                    } else if(field.getText().equalsIgnoreCase("drechseln")) {
                        URI uri = new URL("http://beefman.bplaced.net/drechselnMain.html").toURI();
                        Desktop.getDesktop().browse(uri);
                        field.setText("");
                    } else if(field.getText().equalsIgnoreCase("download")) {
                        URI uri = new URL("http://beefman.bplaced.net/download.html").toURI();
                        Desktop.getDesktop().browse(uri);
                        field.setText("");
                    } else if(field.getText().equalsIgnoreCase("beefman")) {
                        URI uri = new URL("http://beefman.bplaced.net/").toURI();
                        Desktop.getDesktop().browse(uri);
                        field.setText("");
                    } else {
                        URI uri = new URL("https://www.google.de/search?source=hp&ei=BJqBX_DlJq6HjLsPyLa2-A8&q=" + field.getText() + "&oq=" + field.getText() + "&gs_lcp=CgZwc3ktYWIQAzIFCAAQsQMyBQgAELEDMgUIABCxAzIICAAQsQMQgwEyBQgAELEDMgUIABCxAzICCAAyAggAMgIIADICCAA6CAguELEDEIMBOgUILhCxA1D4BljfCWCiDGgAcAB4AIABTYgBiAKSAQE0mAEAoAEBqgEHZ3dzLXdpeg&sclient=psy-ab&ved=0ahUKEwjw94SD9ansAhWuA2MBHUibDf8Q4dUDCAk&uact=5").toURI();
                        Desktop.getDesktop().browse(uri);
                        field.setText("");
                    }
                } catch (URISyntaxException uriSyntaxException) {
                    uriSyntaxException.printStackTrace();
                } catch (MalformedURLException malformedURLException) {
                    malformedURLException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        Field = field;

        JButton button1 = new JButton("Schnellwahl");
        button1.setFont(font);
        button1.setOpaque(true);
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setForeground(Color.WHITE);
        button1.setBounds(180,200,200,30);
        button1.addKeyListener(new KeyHandler());
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Schnellwahl();
            }
        });

        frame.add(label);
        frame.add(field);
        frame.add(button);
        frame.add(button1);
        frame.setVisible(true);
    }

    private static JFrame Schnellwahl() {
        JFrame frame = new JFrame("Schnellwahl");
        frame.setBounds(0,0,650,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(2);
        frame.setResizable(false);
        frame.setLayout(null);

        JButton tauchen = new JButton("Tauchen");
        tauchen.setBounds(10,20,200,120);
        tauchen.setFont(font);
        tauchen.setOpaque(true);
        tauchen.setBackground(Color.LIGHT_GRAY);
        tauchen.setForeground(Color.WHITE);
        tauchen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri = new URL("http://beefman.bplaced.net/tauchenMain.html").toURI();
                    Desktop.getDesktop().browse(uri);
                } catch (URISyntaxException uriSyntaxException) {
                    uriSyntaxException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        JButton drechseln = new JButton("Drechseln");
        drechseln.setBounds(215,20,200,120);
        drechseln.setFont(font);
        drechseln.setOpaque(true);
        drechseln.setBackground(Color.LIGHT_GRAY);
        drechseln.setForeground(Color.WHITE);
        drechseln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri = new URL("http://beefman.bplaced.net/drechselnMain.html").toURI();
                    Desktop.getDesktop().browse(uri);
                } catch (URISyntaxException uriSyntaxException) {
                    uriSyntaxException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        JButton download = new JButton("Download");
        download.setBounds(420,20,200,120);
        download.setFont(font);
        download.setOpaque(true);
        download.setBackground(Color.LIGHT_GRAY);
        download.setForeground(Color.WHITE);
        download.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri = new URL("http://beefman.bplaced.net/download.html").toURI();
                    Desktop.getDesktop().browse(uri);
                } catch (URISyntaxException uriSyntaxException) {
                    uriSyntaxException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        frame.add(tauchen);
        frame.add(drechseln);
        frame.add(download);
        frame.setVisible(true);
        return frame;
    }

}
