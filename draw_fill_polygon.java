import java.awt.*;
import java.applet.*;
public class draw_fill_polygon extends Applet {
    int x[] = {20,50,80};
    int y[] = {80,20,80};
    int x1[] = {100,150,240};
    int y1[] = {80,20,80};
    public void paint(Graphics g)
    {
        g.drawPolygon(x,y,3 );
        g.setColor(Color.pink);
        g.fillPolygon(x1,y1,3);
    } 
}
// <Applet code = draw_fill_polygon.class width="50" height="90"> </Applet> 