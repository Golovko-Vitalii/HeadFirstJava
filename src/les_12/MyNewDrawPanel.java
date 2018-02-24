package les_12;

import javax.swing.*;
import java.awt.*;

public class MyNewDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        int x = (int)(Math.random()*(this.getWidth()-50));
        int y = (int)(Math.random()*(this.getHeight()-50));
        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(x, y, 50, 50);
    }
}
