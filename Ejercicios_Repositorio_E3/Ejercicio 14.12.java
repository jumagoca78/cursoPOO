
//Equipo 3
//27/09/22
// Fig. 14.12: DesktopTest.java      
// Demonstrating JDesktopPane.   

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DesktopTest extends JFrame
{
    private JDesktopPane theDesktop;

    // set up GUI11
  public DesktopTest()    {    
    super( "Using a JDesktopPane");       
    // create menu bar, menu and menu item    
    JMenuBar bar = newJMenuBar();    
    JMenu addMenu = newJMenu( "Add");   
    JMenuItem newFrame = newJMenuItem( "Internal Frame");
    addMenu.add( newFrame );   
    bar.add( addMenu );    
    setJMenuBar( bar );       
    // set up desktop26    
    theDesktop = newJDesktopPane();    
    getContentPane().add( theDesktop );
    // set up listener for newFrame menu item    
    newFrame.addActionListener(

    newActionListener() {

    // anonymous inner class33
    // display new internal window
    public void actionPerformed( ActionEvent event ) {    
          // create internal frame   
          JInternalFrame frame = newJInternalFrame( "Internal Frame", true, true, true, true);   
          // attach panel to internal frame content pane   
          Container container = frame.getContentPane();
          MyJPanel panel = newMyJPanel();    
          container.add( panel, BorderLayout.CENTER);   
          // set size internal frame to size of its contents    
          frame.pack();   
          // attach internal frame to desktop and show it    
          theDesktop.add( frame );     
          frame.setVisible( true);
          } // end anonymous inner class
    );

    // end call to addActionListener
    set Size( 600, 460);    
    set Visible( true);        
        } // end constructor

    publicstaticvoidmain( String args[] )    {         
          DesktopTest application = newDesktopTest();    
          application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);    
        }}} // end class DesktopTest
        // class to display an ImageIcon on a panel

    class MyJPanel extends JPanel{
    privateImageIcon imageIcon;
    privateString[] images = { "yellowflowers.png", "purpleflowers.png", "redflowers.png", "redflowers2.png",
            "lavenderflowers.png" };

    // load image78
    publicMyJPanel()79    
        {
          intrandomNumber = ( int) ( Math.random() * 5);    
          imageIcon = newImageIcon( images[ randomNumber ] );
            }

    // display imageIcon on panel
    publicvoidpaintComponent( Graphics g )    
            {
              // call superclass paintComponent method    
              super.paintComponent( g );
              // display icon    
              imageIcon.paintIcon( this, g, 0, 0);   }

    // return image dimensions95
    public Dimension getPreferredSize() {
        returnnewDimension(imageIcon.getIconWidth(), imageIcon.getIconHeight());
    }
} // end class MyJPanel