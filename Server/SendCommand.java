package Server;
import java.awt.Point;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintWriter;
public class SendCommand implements MouseListener,KeyListener,MouseMotionListener{
    Socket soc;
    PrintWriter obj;
    public SendCommand(Socket soc) {
        this.soc=soc;
        try {
            this.obj=new PrintWriter(soc.getOutputStream());
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.obj.println(Commands.getMOUSE_CLICKED());
        
        try {
        int boutton=1024;
        if (e.getButton()==MouseEvent.BUTTON3) {
            boutton=4096;
        }   
        this.obj.println(boutton);
        this.obj.flush(); 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        this.obj.println(Commands.getMOUSE_CLICKED());
        
        try {
        int boutton=1024;
        if (e.getButton()==MouseEvent.BUTTON3) {
            boutton=4096;
        }   
        this.obj.println(boutton);
        this.obj.flush(); 
        } catch (Exception ex) {
        // TODO: handle exception
            ex.printStackTrace();
        }
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.obj.println(Commands.getMOUSE_RELEASED());
        
        try {
        int boutton=1024;
        if (e.getButton()==MouseEvent.BUTTON3) {
            boutton=4096;
        }   
        this.obj.println(boutton);
        this.obj.flush(); 
        } catch (Exception ex) {
        // TODO: handle exception
            ex.printStackTrace();
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("KeyPressed?");
        try {
         this.obj.println(Commands.getKEY_PRESSED());
         this.obj.println(e.getKeyCode());
        //  this.obj.println(e.getY());
         this.obj.flush();
        } catch (Exception ex) {
         // TODO: handle exception
             ex.printStackTrace();
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("KeyReleased?");
        try {
         this.obj.println(Commands.getKEY_RELEASED());
         this.obj.println(e.getKeyCode());
        //  this.obj.println(e.getY());
         this.obj.flush();
        } catch (Exception ex) {
         // TODO: handle exception
             ex.printStackTrace();
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
   
       System.out.println("Lasa v?");
       try {
        this.obj.println(Commands.getMOUSE_MOVED());
        this.obj.println(e.getX());
        this.obj.println(e.getY());
        this.obj.flush();
       } catch (Exception ex) {
        // TODO: handle exception
            ex.printStackTrace();
       }
       
    }
    
}
