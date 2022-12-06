package Server;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Server.ReceiveScreen;
import java.awt.*;
import java.awt.image.*;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            Server serv=new Server(6667);
            Socket Client=serv.accept();
            Frame frame=new Frame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            JPanel pan=new JPanel();
            //pan.setBackground(Color.CYAN);
            frame.add(pan);
            ReceiveScreen receive=new ReceiveScreen(Client,pan);
            frame.addKeyListener(new SendCommand(Client));
            frame.addMouseListener(new SendCommand(Client));
            frame.addMouseMotionListener(new SendCommand(Client));
            while (true) {
              receive.run();
            }
           
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
}
