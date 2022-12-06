package Client;

import java.io.Serializable;
import Client.Location;
public class Commands implements Serializable{
    public static int MOUSE_MOVED=0;
    public static int MOUSE_CLICKED=1;
    public static int MOUSE_RELEASED=2;
    public static int KEY_PRESSED=3;
    public static int KEY_RELEASED=4;

    int command;
    Location loc;
    public Commands(int command){
        this.command=command;
    }
    public static int getMOUSE_MOVED() {
        return MOUSE_MOVED;
    }
    public static void setMOUSE_MOVED(int mOUSE_MOVED) {
        MOUSE_MOVED = mOUSE_MOVED;
    }
    public static int getMOUSE_CLICKED() {
        return MOUSE_CLICKED;
    }
    public static void setMOUSE_CLICKED(int mOUSE_CLICKED) {
        MOUSE_CLICKED = mOUSE_CLICKED;
    }
    public static int getMOUSE_RELEASED() {
        return MOUSE_RELEASED;
    }
    public static void setMOUSE_RELEASED(int mOUSE_RELEASED) {
        MOUSE_RELEASED = mOUSE_RELEASED;
    }
    public static int getKEY_PRESSED() {
        return KEY_PRESSED;
    }
    public static void setKEY_PRESSED(int kEY_PRESSED) {
        KEY_PRESSED = kEY_PRESSED;
    }
    public static int getKEY_RELEASED() {
        return KEY_RELEASED;
    }
    public static void setKEY_RELEASED(int kEY_RELEASED) {
        KEY_RELEASED = kEY_RELEASED;
    }
    public int getCommand() {
        return command;
    }
    public void setCommand(int command) {
        this.command = command;
    }
    public Location getLoc() {
        return loc;
    }
    public void setLoc(Location loc) {
        this.loc = loc;
    }
}
