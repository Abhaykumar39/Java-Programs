import java.awt.*;
import java.applet.*;
public class colorset extends Applet {
    Color obj = new Color(115,60,78);
    Font a =new Font ("Times New Roman",Font.BOLD,50);
    public void paint(Graphics g)
    {
        g.setColor(obj);
         g.setFont(a);
        g.drawString("Tom is Hero ", 50, 60);
        g.setColor(Color.yellow);
        g.drawString("Jerry is best", 50 , 120);
    }  
    
}
// <Applet code = colorset.class width="50" height="90"> </Applet> 
