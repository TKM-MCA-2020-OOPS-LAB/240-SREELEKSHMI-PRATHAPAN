import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class Figure extends Applet implements ItemListener {

    Choice ch;
    int Select; 
    

    public void init()
    {
        ch = new Choice();
        ch.addItem("SELECT SHAPE");
        ch.addItem("RECTANGLE");
        ch.addItem("SQUARE");
        ch.addItem("CIRCLE");
        ch.addItem("TRIANGLE");
        add(ch);
        ch.addItemListener(this);
    }

 public void itemStateChanged (ItemEvent e)
    {
         
         Select = ch.getSelectedIndex();
         repaint();
    }

 public void paint(Graphics g)
	{
g.setColor(Color.red);  
         super.paint(g);

         if (Select == 1)
         {  
             
             g.drawRect(80, 180, 400, 180);
             g.setColor(Color.cyan);
             g.fillRect(80,180,400,180);
         }
         if (Select == 2)
         {
        	 g.drawRect(100,100,200,200);
                 g.setColor(Color.blue);
                 g.fillRect(100,100,200,200);
         }
         if (Select == 3)
         {
             
             g.drawOval(150,150,400,400);
	     g.setColor(Color.red);
	     g.fillOval(150,150,400,400);
         }
         if (Select ==4)
         {
             g.drawLine(120, 130, 280, 130);
             g.drawLine(120, 130, 200, 65);
             g.drawLine(200, 65, 280, 130);
         }
	}
}
