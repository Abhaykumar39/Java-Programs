import java.awt.*;
import java.applet.*;
public class draw_fill_Rectangle extends Applet{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawRect(20, 20, 70, 40);
        g.setColor(Color.YELLOW);
        g.fillRect(20, 70, 80, 30);
    }
}
// <Applet code = draw_fill_Rectangle.class width="50" height="90"> </Applet> 
                                                                                                                                                                    