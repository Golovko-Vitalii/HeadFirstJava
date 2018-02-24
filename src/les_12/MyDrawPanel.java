package les_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyDrawPanel extends JPanel implements MouseListener, ActionListener {
    private JFrame frame;
    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        frame.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void paintComponent(Graphics g){

        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        Image image = new ImageIcon("C:/cat.jpg").getImage();
        g.drawImage(image, 100, 5, this);
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);

            int x = (int)(Math.random()*500);
            int y = (int)(Math.random()*500);
            int red = (int)(Math.random()*255);
            int green = (int)(Math.random()*255);
            int blue = (int)(Math.random()*255);
            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillOval(x, y, 100, 100);

            x = (int)(Math.random()*500);
            y = (int)(Math.random()*500);
            red = (int)(Math.random()*255);
            green = (int)(Math.random()*255);
            blue = (int)(Math.random()*255);
            Color startColor = new Color(red, green, blue);

        x = (int)(Math.random()*500);
        y = (int)(Math.random()*500);
        red = (int)(Math.random()*255);
        green = (int)(Math.random()*255);
        blue = (int)(Math.random()*255);
        Color endColor = new Color(red, green, blue);

        Graphics2D g2d = (Graphics2D)g;
        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
        g2d.fill3DRect(250,50,100,100,true);


    }
    public static void main(String[] args){
        MyDrawPanel mdp = new MyDrawPanel();

    }
    public MyDrawPanel(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        this.setPreferredSize(new Dimension(400, 400));
        this.addMouseListener(this);

        frame.getContentPane().add(this, BorderLayout.CENTER);
        JButton button = new JButton("Change color");
        button.addActionListener(this);
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.setVisible(true);
    }


}
