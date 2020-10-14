package de.jonas.search;

import java.io.IOException;

public class CheckConnection {

    public static boolean isConnected() throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("ping www.google.de");
        int x = process.waitFor();
        if(x == 0) {
            return true;
        } else {
            return false;
        }
    }

}
