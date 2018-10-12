package de.djk.control;

import de.djk.audio.Player;

/**
 * Trivial program for playing a sound every 10 seconds
 */
public class Controller {

    public static void main(String[] args) throws Exception {
        int rounds = 100;

        for(int i =0; i <rounds; i++){
            Player.play();
            Thread.sleep(10000);
        }
    }
}
