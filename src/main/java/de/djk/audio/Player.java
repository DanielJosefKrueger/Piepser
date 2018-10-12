package de.djk.audio;

import javax.sound.sampled.*;
import java.io.File;

public class Player {
    public static void play() throws Exception {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound.wav"));
        AudioFormat af = audioInputStream.getFormat();
        int size = (int) (af.getFrameSize() * audioInputStream.getFrameLength());
        byte[] audio = new byte[size];
        DataLine.Info info = new DataLine.Info(Clip.class, af, size);
        audioInputStream.read(audio, 0, size);
        Clip clip = (Clip) AudioSystem.getLine(info);
        clip.open(af, audio, 0, size);
        clip.start();
    }
}
