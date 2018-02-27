package les_13;

import javax.swing.*;
import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args){
        TestBorderLayout tbl = new TestBorderLayout();
        tbl.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JButton button = new JButton("click like you mean it");
        frame.getContentPane().add(BorderLayout.EAST, button);
        JButton button1 = new JButton("There is no spoon");
        frame.getContentPane().add(BorderLayout.NORTH, button1);
        JButton button2 = new JButton("Click This!");
        Font bigFont = new Font("serif", Font.BOLD, 28);
        button2.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.SOUTH, button2);
        JButton buttonCenter = new JButton("Center");
        frame.getContentPane().add(BorderLayout.CENTER, buttonCenter);
        JButton west = new JButton("west");
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
