import java.awt.*;
import java.applet.*;
public class Textarea extends Applet {
    TextArea t1= new TextArea("Enter Text",25,100);
    TextArea t2= new TextArea();
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
// <Applet code = Textarea.class width="50" height="90"> </Applet> 
