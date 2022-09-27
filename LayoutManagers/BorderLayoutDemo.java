import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame implements ActionListener
{
    private JButton buttons[];
    private final String names[] = {"Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
    private BorderLayout layout;

    //set up GUI and event handling
    public BorderLayoutDemo()
    {
        super("BoderLayutt Demo");
        layout = new BorderLayout(5,5); //set Layout as BoderLayout with 5pixel horizontal and vertical gaps

        //get content pane and set its layout
        Container container = getContentPane();
        container.setLayout(layout);

        //initiate button objects
        buttons = new JButton [names.length];
        for (int count = 0; count<buttons.length; count++)
        {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this); 
        }

        //place buttons in BorderLayout; order not important
        //Place JButtons in regions specified by BorderLayout
        container.add(buttons[0], BorderLayout.NORTH);
        container.add(buttons[1], BorderLayout.SOUTH);
        container.add(buttons[2], BorderLayout.EAST);
        container.add(buttons[3], BorderLayout.WEST);
        container.add(buttons[4], BorderLayout.CENTER);

        setSize(300, 200);
        setVisible(true);
    } //end constructur BorderLayoutDemo

    //handle button evnets
    public void actionPerformed(ActionEvent event)
    {
        for(int count = 0; count < buttons.length; count++)
            if (event.getSource() == buttons[count]) //when JButtons are "invisible". they are not displayed on screen adnn borderLayout rearranges
            buttons[count].setVisible(false);
        else
            buttons[count].setVisible(true);
        //re-layout the cintent pane
        layout.layoutContainer(getContentPane());
    }

    public static void main(String args[])
    {
        BorderLayoutDemo application = new BorderLayoutDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} //END CLASS BOrder Layour demo
