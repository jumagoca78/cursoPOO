//Change look-and-feel dynamically•e.g., Microsoft Windows look-and-feel to Motif look-and-feel
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.InternalFrameListener;

public class LookAndFeelDemo extends JFrame 
{
    private final String strings[] = {"Metal", "Motif", "Windows"};
    private UIManager.LookAndFeelInfo looks[]; //Hold installed look and feel information
    private JRadioButton radio[];
    private ButtonGroup  group;
    private JButton button;
    private JLabel label;
    private JComboBox comboBox;

    //GUI set up
    public LookAndFeelDemo()
    {
        super("Looks and Feel Demo");

        Container container = getContentPane();

        //set up panel for North BorderLayout
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(3,1,0,5));

        //set up label for North Panel
        label = new JLabel("This is a metal look-and-feel", SwingConstants.CENTER);
        northPanel.add(label);

        //set up button for North Panel
        button = new JButton("JButton");
        northPanel.add(button);

        //set up combo box for North Panel
        comboBox = new JComboBox(strings);
        northPanel.add(comboBox);

        //create array for radio buttons
        radio = new JRadioButton[strings.length];

        //set up panel for SOUTH of BorderLayout
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1, radio.length));

        //set up buttons for SOUTH Panel
        group = new ButtonGroup();
        ItemHandler handler = new ItemHandler();

        for (int count = 0; count < radio.length; count ++)
        {
            radio[count] = new JRadioButton(strings[count]);
            radio[count].addItemListener(handler);
            group.add(radio[count]);
            southPanel.add(radio[count]);
        }

        //attach NORTH and SOUTH panels to content pane
        container.add(northPanel, BorderLayout.NORTH);
        container.add(southPanel, BorderLayout.SOUTH);

        //get look and feel info installed
        looks = UIManager.getInstalledLookAndFeels();

        setSize(300,200);
        setVisible(true);

        radio[0].setSelected(true);
    } //end LookAndFeelDemo constructor

    //use UIManager to change look-and-feel of GUI
    private void changeLookAndFeel(int value)
    {
        //change look and feel
        try
        {
            UIManager.setLookAndFeel(looks[value].getClassName());
            SwingUtilities.updateComponentTreeUI(this);
        }

        //process problems changing look and feel
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static void main(String args[]) 
    {
        LookAndFeelDemo application = new LookAndFeelDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //private inner class to handle radio buttons events
    private class ItemHandler implements ItemListener
    {
        //process user's look-and-feel selection
        public void itemStateChanged(ItemEvent event)
        {
            for (int count = 0; count < radio.length; count++)
                if (radio[count].isSelected())
                {
                    label.setText("This is a "+ strings[count] + "look-and-feel");
                    comboBox.setSelectedIndex(count);
                    changeLookAndFeel(count);
                }
        }
    } //end private inner class ItemHandler
} //end class LookAndFeelDemo
