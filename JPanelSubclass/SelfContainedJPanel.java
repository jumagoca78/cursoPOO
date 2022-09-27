//package com.deitel.jhtp5.ch14;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelfContainedJPanel  extends JPanel
{
    private int x1, y1, x2, y2;

    //set up mouse event handling for SelfContainedPanel
    public SelfContainedJPanel()
    {
        //set upt mouse listener
        addMouseListener(
            new MouseAdapter(){ //anonymous inner class
                //handle mouse press event
                public void mousePressed(MouseEvent event)
                {
                    x1 = event.getX(); //save coordinates where user pressed mouse button
                    y1 = event.getY();
                }

                //handle mouse release event
                public void mouseReleased(MouseEvent event)
                {
                    x2 = event.getX();//save coordintaes where user releases mouse button, then repaint
                    y2 = event.getY();
                    repaint();
                } 
            }// end anonymous inner class
        ); //end call addMouseListener

        //set up mouse motion listener
        addMouseMotionListener(
            new MouseMotionAdapter() //anonymoud inner class
            {
                //gandle mouse drag event
                public void mouseDragged(MouseEvent event)
                {
                    x2 = event.getX();
                    y2 = event.getY();
                    repaint();
                }
            } //end anonymous inner class
        ); //end call to addMouseMotionListener
    }  //end constructor SelfContainedPanel

    //return preferred width and height of SelfContainedPanel
    public Dimension getPreferredSize()
    {
        return new Dimension(150,100);
    }

    //paint an oval at the specified coordinates
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2)); //draw oval
    }
    
} //end class SelfContainedPanel
