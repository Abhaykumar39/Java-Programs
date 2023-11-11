package Unit4;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class Applet_program_Add_two_number extends Applet implements ActionListener
{
    TextField t1= new TextField(10);
    TextField t2= new TextField(10);
    TextField t3= new TextField(10);

    Label l1= new Label("Enter The First Number");
    Label l2= new Label("Enter The Second Number");
    Label l3= new Label("Add");

    Button b = new Button("Add");

    public void paint(Graphics g)
    {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(""+(n1+n2));
        }
    }
}
