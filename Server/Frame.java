package Server;
import java.awt.*;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{
    // JPanel image;
    // Socket client;
    public Frame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim);
        this.setVisible(true);
    }

  
}
