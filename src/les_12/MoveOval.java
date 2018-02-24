package les_12;

import javax.swing.*;
import java.awt.*;

public class MoveOval {
    private JFrame frame;
    private int x,y;
    public static void main(String[] args) {
        MoveOval moveOval = new MoveOval();
        moveOval.go();
    }
    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        DrawPanel drawPanel = new DrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setVisible(true);
        for(int i=0; i<frame.getWidth()-100; i++){
            x = i;
            if(y<frame.getHeight()-100){
                y++;
            }
            drawPanel.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    class DrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.ORANGE);
            g.fillOval(x,y,100,100);
        }
    }
}
