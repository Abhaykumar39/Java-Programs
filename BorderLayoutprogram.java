import java.awt.*;
import java.applet.*;
public class BorderLayoutprogram extends Applet {
    BorderLayout  f1 = new BorderLayout(20,30);
    Button b1= new Button("Submit");
    Button b2= new Button("Play");
    Button b3= new Button("Stop");
    public void init()
    {
        setLayout(f1);
        add("North",b1);
        add("South",b2);
        add("Center",b3);
       
    }
}
// <APPLET code=BorderLayoutprogram.class width="80" height="100"></APPLET> 