package les_01;

import java.awt.*;
import java.awt.event.*;

public class Party {
    public void buildInvite(){
        Frame f = new Frame();
        Label l = new Label("Вечеринка у Lucky");
        Button b = new Button("Your bet");
        Button c = new Button("Reset");
        Panel p = new Panel();
        p.add(l);
    }

    public static void main(String[] args) {
        new Party().buildInvite();
    }
}
