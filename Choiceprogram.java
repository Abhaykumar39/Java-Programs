import java.awt.*;
import java.applet.*;
public class Choiceprogram extends Applet{
    Choice city= new Choice();
    public void init()
    {
        city.addItem("Dehradun");
        city.addItem("Delhi");
        city.addItem("Mumbai");
        city.addItem("Kolkata");

        add(city);
        city.select(2);
    }
    public void paint(Graphics g)
    {
        g.drawString("Result: "+city.getItem(2),20,20);
       // g.drawString("CountItem: "+city.countItems(),20,60);
        g.drawString("Selected index value: "+city.getSelectedIndex(),20,100);
        g.drawString("Selected item name: "+city.getSelectedItem(),20,140);
    }
}
// <Applet code = Choiceprogram.class width="50" height="90"> </Applet> 
