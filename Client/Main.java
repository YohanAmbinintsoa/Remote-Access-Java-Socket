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
            
            for (int i = 0; i < 10; i++) {
                ObjectOutputStream out=new ObjectOutputStream(kil.getOutputStream());
            
                SendScreen send= new SendScreen(bot,kil,rect);
                send.send();
                out.writeObject("bob is good");
                
               System.out.println("jsnxjkksnx");
              
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
   
}