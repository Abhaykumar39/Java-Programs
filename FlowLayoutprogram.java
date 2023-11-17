import java.awt.*;
import java.applet.*;
public class FlowLayoutprogram extends Applet {
    FlowLayout f1= new FlowLayout(FlowLayout.LEFT);//() or  (FlowLayout.RIGHT,30,50)5 
    Button b1= new Button("Submit");
    Button b2= new Button("Play");
    Button b3= new Button("Stop");
    Button b4= new Button("Reset");

    public void init()
    {
        setLayout(f1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
}
// <APPLET code=FlowLayoutprogram.class width="80" height="100"></APPLET> 