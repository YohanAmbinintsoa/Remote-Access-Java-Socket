package Server;
import java.io.Serializable;
/**
 * Location
 */
public class Location implements Serializable{
    int X;
    int Y;
    int KeyCode;
    public Location() {
    }
    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
    public int getKeyCode() {
        return KeyCode;
    }
    public void setKeyCode(int keyCode) {
        KeyCode = keyCode;
    }
   
    

    
    
}