import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

// Fig. 14.13: JTabbedPaneDemo.java
// Demonstrating JTabbedPane.

public class JTabbedPaneDemo extends JFrame {
    super("JTabbedPane Demo ");

    // create JTabbedPane
    JTabbedPaneDemo tabbedPane = new JTabbedPaneDemo();

    // set up panel1 and add it to JTabbedPane
    JLabel label1 = new JLabel("panel one", SwingConstants.CENTER);
    JPanel panel1 = new JPanel();panel1.add(label1);tabbedPane.addTab("Tab One",null,panel1,"First Panel");

    // set up panel2 and add it to JTabbedPane
    JLabel label2 = new JLabel("panel two", SwingConstants.CENTER);
    JPanel panel2 = new JPanel();panel2.setBackground(Color.YELLOW);panel2.add(label2);tabbedPane.addTab("Tab Two",null,panel2,"Second Panel");

    // set up panel3 and add it to JTabbedPane
    JLabel label3 = new JLabel("panel three");
    JPanel panel3 = new JPanel();panel3.setLayout(new BorderLayout());panel3.add(new JButton("North"),BorderLayout.North);panel3.add(new JButton("West"),BorderLayout.West);panel3.add(new JButton("East"),BorderLayout.East);panel3.add(new JButton("South"),BorderLayout.South);panel3.add(label3,BorderLayout.CENTER);tabbedPane.addTab("Tab Three",null,panel3,"Third Panel");

    // add JTabbedPane to container
  getContentPane().add( tabbedPane );
  
  setSize( 250, 200 );
  setVisible( true );
 
  } // end constructor

  public static void main( String args[] )
  {
    JTabbedPaneDemo tabbedPaneDemo = new JTabbedPaneDemo();
    tabbedPaneDemo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

} // end class CardDeck
