package les_13;

import javax.swing.*;
import java.awt.*;

public class TestFrame {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JButton button = new JButton();
        JCheckBox checkBox = new JCheckBox();
        JTextField textField = new JTextField();
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        button.setText("My Button");
        frame.getContentPane().add(BorderLayout.NORTH, checkBox);
        frame.getContentPane().add(BorderLayout.CENTER, textField);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
