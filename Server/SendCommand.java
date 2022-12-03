package Server;
import java.awt.Point;
import java.awt.event.*;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.io.OutputStream;
public class SendCommand implements MouseListener,KeyListener,MouseMotionListener{
    Socket soc;
    ObjectOutputStream obj;
    public SendCommand(Socket soc) {
        this.soc=soc;
        try {
            this.obj=new ObjectOutputStream(soc.getOutputStream());
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
        
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
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
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
       Location loc=new Location();
       loc.setX(e.getX());
       loc.setY(e.getY());
    }
    
}
