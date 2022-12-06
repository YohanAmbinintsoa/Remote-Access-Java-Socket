package Client;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;
import java.awt.*;
public class ReceiveCommands extends Thread{
    InputStream in;
    Socket soc;
    Robot robot;
    public ReceiveCommands(Socket soc){
        this.soc=soc;
        try {
            this.robot=new Robot();
            this.in=soc.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        start();
    }

    public void run() {
        super.run();
        while (true) {
            try {
                //Location loc=(Location)this.in.readObject();
                Scanner scan=new Scanner(this.in);
                int command=scan.nextInt();
                //System.out.println("le commande dia "+loc.getCommand());
                if(command==0){
                    System.out.println("nitsika le souris");
                    robot.mouseMove(scan.nextInt(),scan.nextInt());
                } else if (command==1) {
                    robot.mousePress(scan.nextInt());
                } else if (command==2) {
                    robot.mouseRelease(scan.nextInt());
                } else if (command==3) {
                    robot.keyPress(scan.nextInt());
                } else if (command==4) {
                    robot.keyRelease(scan.nextInt());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    
    public Socket getSoc() {
        return soc;
    }

    public void setSoc(Socket soc) {
        this.soc = soc;
    }

   

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    
}
