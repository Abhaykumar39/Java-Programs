import java.awt.*;
import java.applet.*;
public class Checkboxprogram extends Applet {
    Checkbox c1=new Checkbox("Java");
    Checkbox c2=new Checkbox("HTML");
    Checkbox c3=new Checkbox("Css");
    public void init()
    {
        c1.setState(true);
        add(c1);
        add(c2);
        add(c3);
    }
}
// <Applet code = Checkboxprogram.class width="50" height="90"> </Applet> 