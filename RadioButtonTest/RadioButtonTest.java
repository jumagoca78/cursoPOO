import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonTest extends JFrame {
    private JTextField field;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private JRadioButton plainButton, boldButton, italicButton, boldItalicButton; //declare 4 JRadioButoon instances
    private ButtonGroup radioGroup; //JRadioButtons normally appear as a ButtonGroup

    //create GUI and Fonts
    public RadioButtonTest()
    {
        super("RadioButton Test");

        //get content pane and set its layput
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        //set up textfield
        field = new JTextField("Watch the font style change", 25);
        container.add(field);

        //create radio buttons
        //inittiate JRadioButtons for manipulating JTextField
        plainButton = new JRadioButton("Plain", true);
        container.add(plainButton);

        boldButton = new JRadioButton("Bold", false);
        container.add(boldButton);

        italicButton = new JRadioButton("Italic", false);
        container.add(italicButton);

        boldItalicButton = new JRadioButton("Bold/Italic", false);
        container.add(boldItalicButton);

        //create logical relationship between JRadioButtons
        radioGroup = new ButtonGroup();
        radioGroup.add(plainButton);
        radioGroup.add(boldButton);
        radioGroup.add(italicButton);
        radioGroup.add(boldItalicButton);

        //create font objects
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        field.setFont(plainFont); //set initial font

        //register events for JRadioButtons
        //register JRadioButtons to receive events from RadioButtonHandler
        plainButton.addItemListener(new RadioButtonHandler(plainFont));
        boldButton.addItemListener(new RadioButtonHandler(boldFont));
        italicButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicButton.addItemListener(new RadioButtonHandler(boldItalicFont));

        setSize(300,100);
        setVisible(true);
    } //end RadioButtonTest constructur

    public static void main(String args[])
    {
        RadioButtonTest application = new RadioButtonTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //private inner class to handle radiobutton events
    private class RadioButtonHandler implements ItemListener{
        private Font font;

        public RadioButtonHandler (Font f)
        {
            font = f;
        }

        //handle radio button events
        public void itemStateChanged(ItemEvent event) //when JRadioButton is selected, RadioButtonHandler invokes method itemStateChanged of all registered listeners
        {
            field.setFont(font); //set font corresponding to JRadioButton selected
        }
    } //end private inner class RadioButtonHandler
} //end class RadioButtonTest