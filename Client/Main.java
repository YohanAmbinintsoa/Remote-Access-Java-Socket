package Client;
import java.awt.*;
import java.io.ObjectOutputStream;
import java.net.Socket;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Client kil=new Client("localhost", 6667);
            GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gDev = gEnv.getDefaultScreenDevice();
      
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            String width = "" + dim.getWidth();
            String height = "" + dim.getHeight();
            Rectangle rect=new Rectangle(dim);
            Robot bot=new Robot(gDev);
            while (true) {
                SendScreen send= new SendScreen(bot,kil,rect);
                send.send();
                Thread.sleep(100);
            }
            
            
            } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
   
}