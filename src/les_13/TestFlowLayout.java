package les_13;

import javax.swing.*;
import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args){
        TestFlowLayout tfl = new TestFlowLayout();
        tfl.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("shock me");
        panel.add(button);
        JButton buttonTwo = new JButton("bliss");
        panel.add(buttonTwo);
        JButton buttonThree = new JButton("huh?");
        panel.add(buttonThree);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
