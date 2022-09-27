//demonstrating jeystroke events
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventHandling extends JFrame implements KeyListener
{
    private String line1 = "", line2 = "", line3 = "";
    private JTextArea textArea;

    //GUI Set up
    public KeyEventHandling()
    {
        super("Demonstrating Keystroke Events");

        //set up JTextArea
        textArea = new JTextArea(10,15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        getContentPane().add(textArea);

        addKeyListener(this); //Register JFrame for key events

        setSize(350,100);
        setVisible(true);
    } //end KeyEventHandling contructor

    //handle press of any key
    public void keyPressed(KeyEvent event) //called when user presses key
    {
        line1 = "Key pressed: "+ event.getKeyText(event.getKeyCode()); //returns virtual key code, called when user releases key
        setLines2and3(event);
    }

    //handle releases of any key
    public void keyReleased(KeyEvent event)
    {
        line1 = "Key released: "+ event.getKeyText(event.getKeyCode()); //returns virtual key code, called when user releases key
        setLines2and3(event);
    }

    //handle press of an action key
    public void keyTyped (KeyEvent event)
    {
        line1 = "Key typed: "+ event.getKeyText(event.getKeyCode()); //returns virtual key code, called when user releases key
        setLines2and3(event);
    }

    //set 2nd and 3rd lines of output
    private void setLines2and3 (KeyEvent event)
    {
        line2 = "This key is "+(event.isActionKey()? "":"not")+"an action key";

        String temp = event.getKeyModifiersText(event.getModifiers()); //determine if modifiers keys (ej. aklt, ctrk, meta and shift) were used

        line3 = "Modifier keys pressed: "+(temp.equals("")? "none" : temp);

        textArea.setText(line1 + "\n" + line2 + "\n" + line3);
    }

    public static void main( String args[])
    {
        KeyEventHandling application = new KeyEventHandling();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} //end clasw KeyEventHandling