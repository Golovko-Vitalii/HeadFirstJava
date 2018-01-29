package les_11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We get sequencer");
        } catch(MidiUnavailableException ex){
            System.out.println("Failure");
        }
    }
    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
