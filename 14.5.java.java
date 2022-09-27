 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import javax.swing.event.*;

 public class SliderDemo extends JFrame {
 private JSlider diameterSlider;
 private OvalPanel myPanel;

         // set up GUI
         public SliderDemo()
 {
         super( "Slider Demo" );

         // set up OvalPanel
         myPanel = new OvalPanel();
         myPanel.setBackground( Color.YELLOW );

         // set up JSlider to control diameter value
         diameterSlider =
                 new JSlider( SwingConstants.HORIZONTAL, 0, 200, 10 );
         diameterSlider.setMajorTickSpacing( 10 );
         diameterSlider.setPaintTicks( true );
        // register JSlider event listener
         diameterSlider.addChangeListener(

                 new ChangeListener() { // anonymous inner class

         // handle change in slider value
         public void stateChanged( ChangeEvent e )
 {
                 myPanel.setDiameter( diameterSlider.getValue() );
                 }

         } // end anonymous inner class

         ); // end call to addChangeListener

         // attach components to content pane
         Container container = getContentPane();
         container.add( diameterSlider, BorderLayout.SOUTH );
         container.add( myPanel, BorderLayout.CENTER );

         setSize( 220, 270 );
         setVisible( true );

         } // end constructor SliderDemo

    public static void main( String args[] )
 {
         SliderDemo application = new SliderDemo();
         application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
         }

         } // end class SliderDemo