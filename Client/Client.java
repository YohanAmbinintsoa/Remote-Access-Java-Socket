package Client;

import java.net.Socket;

/**
 * Client
 */
public class Client extends Socket{
    public Client(String host,int port) throws Exception{
        super(host, port);
    }   
}