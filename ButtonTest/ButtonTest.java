//Button Test
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest extends JFrame{
    private JButton plainButton, fancyButton; //create two references to JButton instances

    //GUI Set up
    public ButtonTest() 
    {
        super("Testing Buttons");

        //get content pane and set its layout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        //create buttons
        plainButton = new JButton("Plain Button");
        container.add(plainButton); //initiate JButton with text

        Icon ThumbsUp = new ImageIcon("ThumbsUp.gif");
        Icon clock = new ImageIcon("clock.gif");
        fancyButton = new JButton("Fancy Button", ThumbsUp); //initiate JBUtton with image and rollover image
        fancyButton.setRolloverIcon(clock);
        container.add(fancyButton);

        //Create an instance of inner class ButtonHandler to use ofr button event handling
        ButtonHandler handler = new ButtonHandler();
        fancyButton.addActionListener( handler ); //register JBUttons to receive events from ButtonHandler
        plainButton.addActionListener( handler );

        setSize(275, 100);
        setVisible(true);
    } // end Button Test construct

    public static void main(String args[])
    {
        ButtonTest application = new ButtonTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }

    //Inner class for button event handling
    private class ButtonHandler implements ActionListener
    {
        //handle button event
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonTest.this, "You pressed: "+event.getActionCommand());
        }
    } //ends privat einner class
} //ends class ButtonTest