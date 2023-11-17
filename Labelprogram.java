import java.awt.*;
import java.applet.*;
public class Labelprogram extends Applet{
    Label l1=new Label("Enter the Name:");
    Label l2=new Label("Enter the Address:");
    TextField t1= new TextField(25);
    TextField t2= new TextField(25);
    public void init()
    {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
    }  
}

// <Applet code = Labelprogram.class width="50" height="90"> </Applet> 