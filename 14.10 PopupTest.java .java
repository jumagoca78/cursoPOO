
// Fig. 14.10: PopupTest.java
// Demonstrating JPopupMenus

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PopupTest extends JFrame
{
    private JRadioButtonMenuItem items[];
    private final Color colorValues[] =
            { Color.BLUE, Color.YELLOW,Color.RED};

    private JPopupMenu popupMenu;
    // set up GUI
    public PopupTest()
    {
        super( "Using JPopupMenus");

        ItemHandler handler = new ItemHandler();
        String colors[] = { "Blue", "Yellow", "Red"};

        // set up popup menu and its items
        ButtonGroup colorGroup = new ButtonGroup();
        popupMenu = new JPopupMenu();
        items = new JRadioButtonMenuItem[ 3];

        // construct each menu item and add to popup menu; also
        // enable event handling for each menu item
        for( int count = 0; count < items.length; count++ ) {
            items[ count ] = new JRadioButtonMenuItem( colors[ count ] );
            popupMenu.add( items[ count ] );
            colorGroup.add( items[ count ] );
            items[ count ].addActionListener( handler );
        }

        getContentPane().setBackground( Color.WHITE);
        // declare a MouseListener for the window that displays
        // a JPopupMenu when the popup trigger event occurs
        addMouseListener(

                new MouseAdapter() {  // anonymous inner class

                    // handle mouse press event
                    public void mousePressed( MouseEvent event )
                    {
                        checkForTriggerEvent( event );
                    }
                    // handle mouse release event
                    public void mouseReleased( MouseEvent event )
                    {
                        checkForTriggerEvent( event );
                    }

                    // determine whether event should trigger popup menu
                    private void checkForTriggerEvent( MouseEvent event )
                    {
                        if( event.isPopupTrigger() )
                            popupMenu.show(
                                    event.getComponent(), event.getX(), event.getY() );

                    }

                } // end anonymous inner class

        ); // end call to addMouseListener
        setSize( 300, 200);
        setVisible( true);
    } // end constructor PopupTest

    public static void main( String args[] )
    {
        PopupTest application = new PopupTest();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
    }

    // private inner class to handle menu item events

    private class ItemHandler implements ActionListener {
        // process menu item selections
        public void actionPerformed( ActionEvent event )
        {
            // determine which menu item was selected
            for( int i = 0; i < items.length; i++ )
                if( event.getSource() == items[ i ] ) {
                    getContentPane().setBackground( colorValues[ i ] );
                    return;
                }

        }


    }

}//end class

