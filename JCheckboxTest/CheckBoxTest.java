import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxTest extends JFrame {
    private JTextField field;
    private JCheckBox bold, italic; //declare two checkbox instances

    //set up GUI
    public CheckBoxTest()
    {
        super("JCheckBox Test");

        //get content pane and set layout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        //set up text field and its font
        field = new JTextField ("Watch the font style chande", 20);
        field.setFont(new Font("Serif", Font.PLAIN, 14)); //set font and size of textfield
        container.add(field);

        //create checkbox objects
        bold = new JCheckBox("Bold");
        container.add(bold);

        italic = new JCheckBox("Italic");
        container.add(italic);

        //register listeners for JCheckBoxes
        CheckBoxHandler handler = new CheckBoxHandler();
        bold.addItemListener(handler);
        italic.addItemListener(handler);

        setSize(275, 100);
        setVisible(true);
    } //end of CheckBoxText constructur  
    
    public static void main(String args[])
    {
        CheckBoxTest application = new CheckBoxTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //private inner class for ItemListener event handling
    private class CheckBoxHandler implements ItemListener
    {
        private int valBold = Font.PLAIN;
        private int valItalic = Font.PLAIN;

        //respond to checkbox events
        public void itemStateChanged(ItemEvent event) 
        //when user selects JCheckBox, CheckBoxHandler invokes method itemStateChanfe of all registered listeners
        {
            //process bold checkbox events
            if (event.getSource() == bold)
                valBold = bold.isSelected()? Font.BOLD: Font.PLAIN;

            //process italic checkbox events
            if (event.getSource()==italic)
                valItalic = italic.isSelected()? Font.ITALIC: Font.PLAIN;

            //Set text field font
            field.setFont(new Font("Serif", valBold + valItalic, 14));
        } //end method itemStateChanged
    } //end private inner class CheckBoxHandler
} //end class CheckBoxTest