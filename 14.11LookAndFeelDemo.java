package POB.Interfaces;
// Fig. 14.11: LookAndFeelDemo.java
// Changing the look and feel.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class LookAndFeelDemo extends JFrame  {
    private final String strings[] = { " Metal", "Motif", "Windows"};
    private UIManager.LookAndFeelInfo looks[];
    private JRadioButton radio[];
    private ButtonGroup group;
    private JButton button;
    private JLabel label;
    private JComboBox comboBox;

    // set Up Gui
    public LookAndFeelDemo()
    {
        super( "Look and Feel Demo");
        Container container = getContentPane();

        // set up panel for North of BorderLayout

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(3,1,0,5));

        //set up label for NORTH panel
        label = new JLabel("This is a Metal look-and-feel",
                SwingConstants.CENTER);
        northPanel.add( label);

        //set up button for NORTH panel
        button = new JButton( "JButton");
        northPanel.add (button);

        // set up combo box for NORTH panel
        comboBox = new JComboBox( strings );
        northPanel.add( comboBox );



        // create array for radio buttons
        radio = new JRadioButton[ strings.length ];

        // set up panel for SOUTH of BorderLayout
        JPanel southPanel = new JPanel();
        southPanel.setLayout( new GridLayout( 1, radio.length ) );

        // set up radio buttons for SOUTH panel
        group = new ButtonGroup();
        ItemHandler handler = new ItemHandler();

        for( int count = 0; count < radio.length; count++ ) {
            radio[ count ] = new JRadioButton( strings[ count ] );
            radio[ count ].addItemListener( handler );
            group.add( radio[ count ] );
            southPanel.add( radio[ count ] );

        }
        // attach NORTH and SOUTH panels to content pane
        container.add( northPanel, BorderLayout.NORTH);
        container.add( southPanel, BorderLayout.SOUTH);

        // get installed look-and-feel information
        looks = UIManager.getInstalledLookAndFeels();

        setSize( 300, 200);
        setVisible( true);

    } // end constructor LookAndFeelDemo

    // use UIManager to change look-and-feel of GUI
    private void changeTheLookAndFeel( int value )
    {
        // change look and feel
        try{
            UIManager.setLookAndFeel( looks[ value ].getClassName() );
            SwingUtilities.updateComponentTreeUI( this);

        }
        // process problems changing look and feel
        catch( Exception exception ) {
            exception.printStackTrace();
        }

    }
    public static void main( String args[] ) {
        LookAndFeelDemo application = new LookAndFeelDemo();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

    }

    // private inner class to handle radio button events
    private class ItemHandler implements ItemListener {
        // process user's look-and-feel selection
        public void itemStateChanged( ItemEvent event )
        {
            for( int count = 0; count < radio.length; count++ )
                if( radio[ count ].isSelected() ) {
                    label.setText( "This is a "+
                            strings[ count ] + " look-and-feel");
                    comboBox.setSelectedIndex( count );
                    changeTheLookAndFeel( count );
                }
        }
    }

}//end class
