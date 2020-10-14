package de.jonas.search;

import java.io.IOException;

public class SearchMain {

    public static void main(String args[]) throws IOException, InterruptedException {
        if(CheckConnection.isConnected() == true) {
            new GUI();
        } else {
            new Offline();
        }
    }

}
