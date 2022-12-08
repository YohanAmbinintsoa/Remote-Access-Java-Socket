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
    DataOutputStream obj;
    public SendCommand(Socket soc) {
        this.soc=soc;
        try {
            this.obj=new DataOutputStream(soc.getOutputStream());
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        // try {
        // int boutton=1024;
        // if (e.getButton()==MouseEvent.BUTTON3) {
        //     boutton=4096;
        // }   
        // this.obj.writeInt(Commands.getMOUSE_CLICKED());
        // this.obj.writeInt(boutton);
        // this.obj.flush(); 
        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }
        
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
        
        
        try {
        int boutton=1024;
        if (e.getButton()==MouseEvent.BUTTON3) {
            boutton=4096;
        }   
        this.obj.writeInt(Commands.getMOUSE_CLICKED());
        this.obj.writeInt(boutton);
        this.obj.flush(); 
        } catch (Exception ex) {
        // TODO: handle exception
            ex.printStackTrace();
        }
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        
        try {
        int boutton=1024;
        if (e.getButton()==MouseEvent.BUTTON3) {
            boutton=4096;
        }   
        this.obj.writeInt(Commands.getMOUSE_RELEASED());
        this.obj.writeInt(boutton);
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
         this.obj.writeInt(Commands.getKEY_PRESSED());
         this.obj.writeInt(e.getKeyCode());
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
         this.obj.writeInt(Commands.getKEY_RELEASED());
         this.obj.writeInt(e.getKeyCode());
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
        this.obj.writeInt(Commands.getMOUSE_MOVED());
        this.obj.writeInt(e.getX());
        this.obj.writeInt(e.getY());
        this.obj.flush();
       } catch (Exception ex) {
        // TODO: handle exception
            ex.printStackTrace();
       }
       
    }
    
}
