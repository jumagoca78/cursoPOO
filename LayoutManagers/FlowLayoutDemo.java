import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame
{
    private JButton leftButton, centerButton, rightButton;
    private Container container;
    private FlowLayout layout;

    //GUI Set up and regidter button listeners
    public FlowLayoutDemo()
    {
        super("FlowLayout Demo");

        layout = new FlowLayout(); //set layout as FlowLayout

        //get content pane and set its layout
        container = getContentPane();
        container.setLayout(layout); //set layout as FlowLayout

        //set uo leftButton and register listener
        leftButton = new JButton("Left");
        container.add(leftButton);
        leftButton.addActionListener(

            new ActionListener() //anonymous inner class
            {
                //process left Button event
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.LEFT); //when user presses lef JButton, lef align components

                    //realign attached components
                    layout.layoutContainer(container);
                }
            } //end anonymous inner class
        ); //end call to addActionListener

        //set uo centerButton and register listener
        centerButton = new JButton("Center");
        container.add(centerButton);
        centerButton.addActionListener(
            new ActionListener () //anonymous inner class
            {
                //process centerButton event
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.CENTER); //When user presses center Button, center components
                    //realignt attached components 
                    layout.layoutContainer(container);
                }
            } //end anonymous class
        ); //end call to addActionListener

        //set uo rightButton and register listener
        rightButton = new JButton("Right");
        container.add(rightButton);
        rightButton.addActionListener(
            new ActionListener () //anonymous inner class
            {
                //process centerButton event
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.RIGHT); //When user presses center Button, center components
                    //realignt attached components 
                    layout.layoutContainer(container);
                }
            } //end anonymous class
        ); //end call to addActionListener

        setSize(350,75);
        setVisible(true);
    } //end FlowLayoutDemos constructor

    public static void main(String args[]) 
    {
        FlowLayoutDemo application =new FlowLayoutDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }   
} //end class FlowLayoutDemo