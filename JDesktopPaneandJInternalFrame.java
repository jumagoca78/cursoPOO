 // Fig. 14.12: DesktopTest.java
      // Demonstrating JDesktopPane.
      importjava.awt.*;
     import java.awt.event.*;
      importjavax.swing.*;
      
      publicclass DesktopTest extends JFrame {
      private JDesktopPane theDesktop;
      
    // set up GUI
    publicDesktopTest()
    {
    super("Using a JDesktopPane");
    
    // create menu bar, menu and menu item
    JMenuBar bar =new JMenuBar();
    JMenu addMenu = new JMenu("Add");
    JMenuItem newFrame =new JMenuItem("Internal Frame");
    
    addMenu.add( newFrame );
    bar.add( addMenu );
    
    setJMenuBar( bar );
 
    // set up desktop
    theDesktop = new JDesktopPane();
   getContentPane().add( theDesktop );
   
    // set up listener for newFrame menu item
    newFrame.addActionListener(
    
   new ActionListener() { // anonymous inner class
    
    // display new internal window
    public void actionPerformed( ActionEvent event ) {
    
    // create internal frame
    JInternalFrame frame =newJInternalFrame(   
    "Internal Frame",true,true,true,true);
    
    // attach panel to internal frame content pane
    Container container = frame.getContentPane();
    MyJPanel panel =newMyJPanel();
    container.add( panel,BorderLayout.CENTER);
    
    // set size internal frame to size of its contents
    frame.pack();
    
    // attach internal frame to desktop and show it
    theDesktop.add( frame );
    frame.setVisible(true);
    }
    
   }// end anonymous inner class
    
   );// end call to addActionListener
    
    setSize(600,460);
    setVisible(true);
    
    }// end constructor
    
    public static void main( String args[] )
    {    
    DesktopTest application = new DesktopTest();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   }// end class DesktopTest
    
    // class to display an ImageIcon on a panel
    class MyJPanel extends JPanel {
    privateImageIcon imageIcon;
    privateString[] images = {"yellowflowers.png","purpleflowers.png",
    "redflowers.png","redflowers2.png","lavenderflowers.png"};   
    // load image
    public MyJPanel()
    {
   intrandomNumber = (int) ( Math.random() *5);
    imageIcon = new ImageIcon( images[ randomNumber ] );
    }
    
    // display imageIcon on panel
    publicvoid paintComponent( Graphics g )
    {
    // call superclass paintComponent method
    super.paintComponent( g );
    
    // display icon
    imageIcon.paintIcon(this, g,0,0);
    }
    
    // return image dimensions
    public Dimension getPreferredSize()
    {
    return new Dimension( imageIcon.getIconWidth(),
    imageIcon.getIconHeight() );               
   }
  
  }// end class MyJPanel