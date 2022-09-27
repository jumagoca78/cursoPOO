import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//import com.deitel.jhtp5.ch14.SelfContainedJPanel;

public class SelfContainedPanelTest extends JFrame
{
    private SelfContainedJPanel myPanel;

    //set up GUI and mouse motion event handlers for application window
    public SelfContainedPanelTest()
    {
        myPanel = new SelfContainedJPanel(); //initiate SelfContainedPanel object and set background color to yellow
        myPanel.setBackground(Color.YELLOW);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(myPanel);

        //set up mouse motion event handling
        addMouseMotionListener(
            new MouseMotionListener() //anonymous inner class
            {
                //handle mouse drag event
                public void mouseDragged(MouseEvent event)
                {
                    setTitle("Dragging: x =" +event.getX() + "; y =" + event.getY());
                }

                //handle mouse move event
                public void mouseMoved(MouseEvent event)
                {
                    setTitle("Moving: x =" +event.getX() + "; y =" + event.getY());
                }
            } //end anonymous inner class
        );  //end call to addMouseMotionListener
        
        setSize(300,200);
        setVisible(true);
    } //end SelfContainedPanelTest constructur

    public static void main(String args[]) 
    {
        SelfContainedPanelTest application = new SelfContainedPanelTest();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
} //end SelfContainedPanelTest class
