
//Equipo 3
//27/09/22
// Fig. 13.13: ComboBoxTest.java
// Using a JComboBox to select an image to display.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
private JComboBox imagesComboBox;
private JLabel label;

private String names[] =
{ "bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif"};
private Icon icons[] = { new ImageIcon( names[ 0 ] ),
new ImageIcon( names[ 1 ] ), new ImageIcon( names[ 2 ] ),
new ImageIcon( names[ 3 ] ) };

// set up GUI
public Main()
  {
    super( "Testing JComboBox");

// get content pane and set its layout
    Container container = getContentPane();
    container.setLayout( new FlowLayout() ); 
  // set up JComboBox and register its event handler
imagesComboBox = new JComboBox( names );
imagesComboBox.setMaximumRowCount( 3 );
imagesComboBox.addItemListener(
new ItemListener() {  // anonymous inner class 
// handle JComboBox event
  public void itemStateChanged( ItemEvent event )
  {
// determine whether check box selected
  if( event.getStateChange() == ItemEvent.SELECTED)
  label.setIcon( icons[ 
                imagesComboBox.getSelectedIndex() ] );
  }
}  // end anonymous inner class
); // end call to addItemListener
container.add( imagesComboBox );
// set up JLabel to display ImageIcons
label = new JLabel( icons[ 0 ] );
container.add( label );
setSize( 350, 100);
setVisible( true );
} // end ComboBoxTest constructor
public static void main( String args[] )
  { 
    Main application = new Main();
    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
  }
} // end class ComboBoxTest
