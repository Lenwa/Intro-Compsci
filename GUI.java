package guiex;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class GUI {
    
    private JFrame window;
    private GamePanel panel1;
    
    public GUI(){
        window = new JFrame("GUI Demonstration");
        window.setSize(600, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        
        // define the panels
        
        panel1 = new GamePanel();
        panel1.setBackground(new Color(87,234,7));
        
        window.add(panel1);
        
        
       // show the window
       window.setVisible(true);
    }
}
