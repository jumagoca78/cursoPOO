import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTabbedPaneDemo extends JFrame
{
    //GUI Set up
    public JTabbedPaneDemo()
    {
        super("JTabbedPane Demo");

        //create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        //set up pane11 and add it to the JTabbedPane
        JLabel label1 = new JLabel("Panel one", SwingConstants.CENTER);
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        tabbedPane.addTab("Tab one", null, panel1, "First Panel");

        //set up pane12 and add it to the JTabbedPane
        JLabel label2 = new JLabel("Panel two", SwingConstants.CENTER);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        panel2.add(label2);
        tabbedPane.addTab("Tab two", null, panel2, "Second Panel");

        //set up pane12 and add it to the JTabbedPane
        JLabel label3 = new JLabel("Panel three", SwingConstants.CENTER);
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(new JButton("North"), BorderLayout.NORTH);
        panel3.add(new JButton("South"), BorderLayout.SOUTH);
        panel3.add(new JButton("East"), BorderLayout.EAST);
        panel3.add(new JButton("West"), BorderLayout.WEST);
        panel3.add(label3, BorderLayout.CENTER);
        tabbedPane.addTab("Tab three", null, panel3, "Third Panel");

        //add JTabbedPane to container
        getContentPane().add(tabbedPane);

        setSize(250,200);
        setVisible(true);
    } //end constructor
    
    public static void main(String args[]) 
    {
        JTabbedPaneDemo tabbedPaneDemo = new JTabbedPaneDemo();
        tabbedPaneDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}