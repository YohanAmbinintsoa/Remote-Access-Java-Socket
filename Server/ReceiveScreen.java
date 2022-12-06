package Server;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
public class ReceiveScreen extends Thread{
   Socket soc;
   DataInputStream in;
   JPanel show;
   Image image1;
   public  ReceiveScreen(Socket soc,JPanel show){
      this.soc=soc;
      this.show=show;
      try {
         in=new DataInputStream(soc.getInputStream());
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   @Override
   public void run() {
      try {
         super.run();
         byte[] sizeAr = new byte[4];
         in.readFully(sizeAr);
         
         int size = ByteBuffer.wrap(sizeAr).asIntBuffer().get();
         // int size=2048*2048;
         byte[] imageAr = new byte[size];
         int totalRead = 0;
         int currentRead;
         while (totalRead < size && (currentRead = in.read(imageAr, totalRead, size-totalRead)) != -1 ) {
             totalRead += currentRead;
         }

         image1 = ImageIO.read(new ByteArrayInputStream(imageAr));
         Graphics2D g2d = (Graphics2D) show.getGraphics();
         g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
         g2d.drawImage(image1, 0, 0, image1.getWidth(null), image1.getHeight(null),null);
           
            // ObjectInputStream input=new ObjectInputStream(in);
            // ImageContainer container=(ImageContainer)input.readObject();
            // BufferedImage image1=container.getBuffer();
            // byte[] bytes = new byte[2048 * 2048];
            // int count = 0;
            // do {
            //   count += in.read(bytes, count, bytes.length - count);
            //   System.out.println("count="+count);
            // } while (
            //   !(
            //     count > 4 &&
            //     bytes[count - 2] == (byte) -1 &&
            //     bytes[count - 1] == (byte) -39 
            //   )
            // );
            // image1 = ImageIO.read(new ByteArrayInputStream(bytes));
            // image1 = image1.getScaledInstance( this.show.getWidth(), show.getHeight(), Image.SCALE_FAST);
            // // System.out.println(image1.getClass());
            // // show.setImage1(image1);
            // // show.repaint();
            //  Graphics graphics = show.getGraphics();graphics.drawImage(image1,0,0,show.getWidth(),show.getHeight(),show);
        
      } catch (Exception e) {
         // TODO: handle exception
      }
      // TODO Auto-generated method stub
     
    
   }
   
   
}
