import java.awt.*;
import java.applet.*;
public class drawline extends Applet {
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawLine(20, 20, 100, 20);
        g.setColor(Color.yellow);
         g.drawLine(20, 20, 20, 100);
        g.setColor(Color.pink);
         g.drawLine(100, 20, 20, 100);
    }  
}
// <Applet code = drawline.class width="50" height="90"> </Applet> 
