package Client;

import java.awt.*;
import java.awt.image.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

import javax.imageio.ImageIO;
/**
 * SendScreen
 */

public class SendScreen extends Thread{
    Robot capture;
    Socket soc;
    Rectangle screen;
    DataOutputStream out;
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
       start();
    }

    public void run(){
           try {
            while (true) {
                this.out=new DataOutputStream(soc.getOutputStream());
                RenderedImage image=capture.createScreenCapture(screen);
                ByteArrayOutputStream byteOut=new ByteArrayOutputStream();
                ImageIO.write(image, "jpeg", byteOut);
                byte[] size = ByteBuffer.allocate(4).putInt(byteOut.size()).array();
                out.write(size);
                out.write(byteOut.toByteArray());
                out.flush();
            }
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

    public DataOutputStream getOut() {
        return out;
    }

    public void setOut(DataOutputStream out) {
        this.out = out;
    }
    
    
}