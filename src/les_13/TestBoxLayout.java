package les_13;



import javax.swing.*;

import java.awt.*;

import static javax.swing.BoxLayout.Y_AXIS;

public class TestBoxLayout {
    public static void main(String[] args){
        TestBoxLayout tbl = new TestBoxLayout();
        tbl.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton buttonOne = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        panel.setLayout(new BoxLayout(panel, Y_AXIS));
        panel.add(buttonOne);
        panel.add(buttonTwo);
        panel.setBackground(Color.cyan);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
