package guiex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    private Random rand;
    private int x = 80,y = 40;
    public GamePanel(){
        super();
        setBackground(new Color(87,234,7));
        rand = new Random();
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawRect(100, 100, 100, 50);
        g2.setColor(Color.WHITE);
        g2.fillRect(200, 200, 30, 120);
        g2.setColor(Color.blue);
        g2.drawRect(200, 200, 30, 120);
        g2.fillOval(rand.nextInt(600 - x), rand.nextInt(400-y),60, 40);
        g2.setColor(new Color(rand.nextInt(255), rand.nextInt(255),
                rand.nextInt(255)));
        
    }
}
