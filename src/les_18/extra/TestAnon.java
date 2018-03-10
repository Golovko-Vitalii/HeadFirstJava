package les_18.extra;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestAnon {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JButton button = new JButton("Click");
        //button.addActionListener(new...);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
