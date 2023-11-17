import java.awt.*;
import java.applet.*;
public class Textfield extends Applet {
    TextField t1= new TextField("Enter Text",25);// you can pass any number of arguments to this constructor
    TextField t2= new TextField();
    public void init()
    {
        t2.setText("Enter Happy Text");
        t2.setEditable(false);
        add(t1);
        add(t2);
    }   
    public void paint(Graphics g)
    {
        g.drawString("Result:"+t1.getText(),30,40);
    }
}
// <Applet code = Textfield.class width="50" height="90"> </Applet> 
