import java.awt.*;
import java.applet.*;
public class Listprogram extends Applet{
    List city = new List();
    public void init()
    {
        city.add("Dehradun");
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Kolkata");
        add(city);
        city.setMultipleMode(true);
        city.select(2);
    }
    
}
// <Applet code = Listprogram.class width="50" height="90"> </Applet> 
