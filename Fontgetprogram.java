import java.applet.*;
import java.awt.*;
public class Fontgetprogram extends Applet
{
    Font obj = new Font("Times New Roman",Font.BOLD,40);
    Font obj1 = new Font("Serif",Font.BOLD,40);
    public void paint(Graphics g)
    {
        g.setFont(obj);
        g.drawString("ABHAY KUMAR", 20, 80);
        g.drawString("Font Details:"+g.getFont(), 30,200);
        g.setFont(obj1);
        g.drawString("Do not Deserve anything", 200, 80);
        g.drawString("Font Details:"+g.getFont().getName(), 240,500);
        g.drawString("Font Details:"+g.getFont().getStyle(), 240,700);
        g.drawString("Font Details:"+g.getFont().getSize(), 240,600);
    }
}
// <APPLET code= Fontgetprogram.class width="80" height="100"></APPLET>                  
    

