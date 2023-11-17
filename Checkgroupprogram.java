import java.awt.*;
import java.applet.*;
public class Checkgroupprogram extends Applet {
    CheckboxGroup group = new CheckboxGroup();
    Checkbox c1=new Checkbox("Java",group,false);
    Checkbox c2=new Checkbox("HTML",group,false);
    Checkbox c3=new Checkbox("Css",group,false);
    public void init()
    {
        c1.setState(true);
        add(c1);
        add(c2);
        add(c3);
    }
}
// <Applet code = Checkgroupprogram.class width="50" height="90"> </Applet> 