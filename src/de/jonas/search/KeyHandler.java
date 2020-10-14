package de.jonas.search;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if(GUI.Field.getText().equalsIgnoreCase("tauchen")) {
                    URI uri = new URL("http://beefman.bplaced.net/tauchenMain.html").toURI();
                    Desktop.getDesktop().browse(uri);
                    GUI.Field.setText("");
                } else if(GUI.Field.getText().equalsIgnoreCase("drechseln")) {
                    URI uri = new URL("http://beefman.bplaced.net/drechselnMain.html").toURI();
                    Desktop.getDesktop().browse(uri);
                    GUI.Field.setText("");
                } else if(GUI.Field.getText().equalsIgnoreCase("download")) {
                    URI uri = new URL("http://beefman.bplaced.net/download.html").toURI();
                    Desktop.getDesktop().browse(uri);
                    GUI.Field.setText("");
                } else if(GUI.Field.getText().equalsIgnoreCase("beefman")) {
                    URI uri = new URL("http://beefman.bplaced.net/").toURI();
                    Desktop.getDesktop().browse(uri);
                    GUI.Field.setText("");
                } else {
                    URI uri = new URL("https://www.google.de/search?source=hp&ei=BJqBX_DlJq6HjLsPyLa2-A8&q=" + GUI.Field.getText() + "&oq=" + GUI.Field.getText() + "&gs_lcp=CgZwc3ktYWIQAzIFCAAQsQMyBQgAELEDMgUIABCxAzIICAAQsQMQgwEyBQgAELEDMgUIABCxAzICCAAyAggAMgIIADICCAA6CAguELEDEIMBOgUILhCxA1D4BljfCWCiDGgAcAB4AIABTYgBiAKSAQE0mAEAoAEBqgEHZ3dzLXdpeg&sclient=psy-ab&ved=0ahUKEwjw94SD9ansAhWuA2MBHUibDf8Q4dUDCAk&uact=5").toURI();
                    Desktop.getDesktop().browse(uri);
                    GUI.Field.setText("");
                }
            } catch (URISyntaxException uriSyntaxException) {
                uriSyntaxException.printStackTrace();
            } catch (MalformedURLException malformedURLException) {
                malformedURLException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
