import java.applet.*;
import java.awt.*;
public class Parametre extends Applet{
    public void paint(Graphics g) {
        String str= this.getParameter("msg");
        g.drawString(str, 500, 400);
    }
    
}
// <APPLET code = "Parameter.class" width="110" height="110"> </APPLET>
