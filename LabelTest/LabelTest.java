//20/09/22
//LabelTest
//Demonstrating JLabel Class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelTest extends JFrame 
{
    private JLabel label1, label2, label3;

    //set uo GUI (Graphical User Interface)
    public LabelTest()
    {
        super ("Testing JLabel");

        //get content pane and set its layout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        //Jlabel constructor with a string argument
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        container.add(label1);

        //JLabel constructor with string, Icon and alignment
        Icon mouse = new ImageIcon("mouse.gif");
        label2 = new JLabel ("Label with text and icon", mouse, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        container.add(label2);

        //JLabel constructur with no arguments
        label3 = new JLabel();
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(mouse);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        container.add(label3);

        setSize(275, 170);
        setVisible(true);
    } //end  constructor

public static void main(String args[]) 
{
    LabelTest application = new LabelTest();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
