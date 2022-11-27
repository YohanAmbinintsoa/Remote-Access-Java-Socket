package Server;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            Server serv=new Server(6667);
            Socket Client=serv.accept();
            for (int i = 0; i <10; i++) {
                ObjectInputStream in=new ObjectInputStream(Client.getInputStream());
                System.out.println(in.readObject().toString());
            }
          
        } catch (Exception e) {
            
        }
    }
   
}
