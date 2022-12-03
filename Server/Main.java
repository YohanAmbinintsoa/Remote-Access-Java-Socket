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

import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            Server serv=new Server(6667);
            Socket Client=serv.accept();
            JFrame frame=new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            while (true) {
                InputStream in=Client.getInputStream();
                byte[] bytes = new byte[1024 * 1024];
                int count = 0;
                do {
                    System.out.println(bytes.length);
                  count += in.read(bytes, count, bytes.length - count);
                  System.out.println("count="+count);
                } while (
                  !(
                    count > 4 &&
                    bytes[count - 2] == (byte) -1 &&
                    bytes[count - 1] == (byte) -39
                  )
                );
                Image image1 = ImageIO.read(new ByteArrayInputStream(bytes));
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new JLabel(new ImageIcon(image1)));
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
}
