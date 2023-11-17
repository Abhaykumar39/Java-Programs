import java.awt.*;
import java.applet.*;
 public class draw_fill_Oval extends Applet{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawOval(20, 20, 70, 40);
        g.setColor(Color.YELLOW);
        g.fillOval(20, 70, 80, 30);
    }
}
// <Applet code = draw_fill_Oval.class width="50" height="90"> </Applet> 
                                                                                                      


