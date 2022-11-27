package Client;
import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.imageio.ImageIO;
/**
 * SendScreen
 */
public class SendScreen {
    Robot capture;
    Socket soc;
    Rectangle screen;
    OutputStream out;
    boolean stop;
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public SendScreen(Robot capture, Socket soc, Rectangle screen) {
        this.capture = capture;
        this.soc = soc;
        this.screen = screen;
        this.stop=false;
       
    }

    public void send(){
            try {
                this.out=soc.getOutputStream();
            } catch (Exception e) {
                // TODO: handle exception
            }
       
            BufferedImage image=capture.createScreenCapture(screen);
            try {
                ImageIO.write(image,"jpeg", out);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           
    }


    public Robot getCapture() {
        return capture;
    }
    public void setCapture(Robot capture) {
        this.capture = capture;
    }
   
    public Rectangle getScreen() {
        return screen;
    }
    public void setScreen(Rectangle screen) {
        this.screen = screen;
    }

    public Socket getSoc() {
        return soc;
    }

    public void setSoc(Socket soc) {
        this.soc = soc;
    }

    public OutputStream getOut() {
        return out;
    }

    public void setOut(OutputStream out) {
        this.out = out;
    }
    
    
}