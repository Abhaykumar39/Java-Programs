import java.awt.*;
import java.applet.*;
public class colorget extends Applet {
    Color obj = new Color(115,60,78);
    Font a =new Font ("Times New Roman",Font.BOLD,50);
    public void paint(Graphics g)
    {
        g.setColor(obj);
          g.setFont(a);
        g.drawString("Tom is Hero ", 50, 60);
        g.drawString("Color Details"+g.getColor(), 50, 120);
        g.setColor(Color.yellow);
        g.drawString("Jerry is best", 50 , 180);
        g.drawString("Color Details"+g.getColor(), 50, 240);
    }  
    
}
// <Applet code = colorget.class width="50" height="90"> </Applet> 
