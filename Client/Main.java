package Client;
import java.awt.*;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            String ip = JOptionPane.showInputDialog("Server Ip Adress");
            Client kil=new Client(ip, 6667);
            GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gDev = gEnv.getDefaultScreenDevice();
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle rect=new Rectangle(dim);
            Robot bot=new Robot(gDev);
            SendScreen send= new SendScreen(bot,kil,rect);
            ReceiveCommands commands=new ReceiveCommands(kil);
            } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
   
}