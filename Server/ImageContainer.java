package Server;

import java.io.Serializable;
import java.awt.image.*;
public class ImageContainer implements Serializable{
    BufferedImage buffer;

    public BufferedImage getBuffer() {
        return buffer;
    }

    public void setBuffer(BufferedImage buffer) {
        this.buffer = buffer;
    }

    public ImageContainer(BufferedImage buffer) {
        this.buffer = buffer;
    }

    

    
}
