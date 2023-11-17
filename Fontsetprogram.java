import java.applet.*;
import java.awt.*;
public class Fontsetprogram extends Applet
{
    Font obj = new Font("Times New Roman",Font.BOLD,80);
    Font obj1 = new Font("Serif",Font.BOLD,80);
    public void paint(Graphics g)
    {
        g.setFont(obj);
        g.drawString("ABHAY KUMAR", 20, 80);
        g.setFont(obj1);
        g.drawString("Do not Deserve anything", 200, 80);
    }
}
// <APPLET code= Fontsetprogram.class width="80" height="100"></APPLET>