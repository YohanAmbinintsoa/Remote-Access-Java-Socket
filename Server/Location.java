package Server;
import java.io.Serializable;
/**
 * Location
 */
public class Location implements Serializable{
    Integer command;
    Integer X;
    Integer Y;
    Integer KeyCode;
    public Location() {
    }
    public Integer getCommand() {
        return command;
    }
    public void setCommand(Integer command) {
        this.command = command;
    }
    public Integer getX() {
        return X;
    }
    public void setX(Integer x) {
        X = x;
    }
    public Integer getY() {
        return Y;
    }
    public void setY(Integer y) {
        Y = y;
    }
    public Integer getKeyCode() {
        return KeyCode;
    }
    public void setKeyCode(Integer keyCode) {
        KeyCode = keyCode;
    }
   
}