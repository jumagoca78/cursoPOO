/ Fig. 14.2: CustomPanel.java
// A customized JPanel class.
import java.awt.*;
import javax.swing.*;     
public class CustomPanel extends JPanel {
public final static int CIRCLE=1,SQUARE=2;
private int shape;    
// use shape to draw an oval or rectangle
public void paintComponent( Graphics g )
{
super.paintComponent( g );
if( shape == CIRCLE)
g.fillOval(50,10,60,60);
else if( shape ==SQUARE)
g.fillRect(50,10,60,60);
}

// set shape value and repaint CustomPanel
public void draw( int shapeToDraw )
{
shape = shapeToDraw;
repaint();
}
} // end class CustomPanel
