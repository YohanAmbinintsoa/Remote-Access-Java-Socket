package Server;

import javax.swing.JPanel;
import java.awt.*;
public class Panel extends JPanel{
    Image image1;

    @Override
    public void paint(Graphics g){
        g.drawImage(image1, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    public Image getImage1() {
        return image1;
    }

    public void setImage1(Image image1) {
        this.image1 = image1;
    }

    

}
