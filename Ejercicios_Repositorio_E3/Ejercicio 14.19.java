
//Equipo 3
//27/09/22
// Fig. 14.19: GridBagDemo.java
// Demonstrating GridBagLayout.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;6

public class GridBagDemo extends JFrame {
    private Container container;
    private GridBagLayout layout;
    private GridBagConstraints constraints;

    // set up GUI
 public GridBagDemo()
{
   super( "GridBagLayout" );

   container = getContentPane();
   layout = new GridBagLayout();
   container.setLayout( layout );

   // instantiate gridbag constraints
   constraints = new GridBagConstraints();

   // create GUI components
   JTextArea textArea1 = new JTextArea( "TextArea1", 5, 10 );
   JTextArea textArea2 = new JTextArea( "TextArea2", 2, 2 );

   String names[] = { "Iron", "Steel", "Brass" };
    JComboBox comboBox = new JComboBox( names );
   
    JTextField textField = new JTextField( "TextField" );
    JButton button1 = new JButton( "Button 1" );
    JButton button2 = new JButton( "Button 2" );
    JButton button3 = new JButton( "Button 3" );
    Line 38
    // weightx and weighty for textArea1 are both 0: the default First JTextArea spans
    // anchor for all components is CENTER: the default
    constraints.fill = GridBagConstraints.BOTH;
    addComponent( textArea1, 0, 0, 1, 3 );

    // weightx and weighty for button1 are both 0: the default
    constraints.fill = GridBagConstraints.HORIZONTAL;
    addComponent( button1, 0, 1, 2, 1 );

    // weightx and weighty for comboBox are both 0: the default
    // fill is HORIZONTAL
    addComponent( comboBox, 2, 1, 2, 1 );

    // button2
    constraints.weightx = 1000; // can grow wider
    constraints.weighty = 1; // can grow taller
    constraints.fill = GridBagConstraints.BOTH;
    addComponent( button2, 1, 1, 1, 1 );

    // fill is BOTH for button3
    constraints.weightx = 0;
    constraints.weighty = 0;
    addComponent( button3, 1, 2, 1, 1 );

    // weightx and weighty for textField are both 0, fill is BOTH
    addComponent( textField, 3, 0, 2, 1 );

   // weightx and weighty for textArea2 are both 0, fill is BOTH
   addComponent( textArea2, 3, 2, 1, 1 );
   setSize( 300, 150 );
   setVisible( true );
   } // end constructor GridBagDemo 70

    // method to set constraints on

    private void addComponent(Component component, int row, int column, int width, int height) {
        // set gridx and gridy
        constraints.gridx = column;
        constraints.gridy = row;

        // set gridwidth and gridheight
        constraints.gridwidth = width;
        constraints.gridheight = height;
        // set constraints and add component
        layout.setConstraints(component, constraints);
        container.add(component);
    }

    public static void main(String args[]) {
        GridBagDemo application = new GridBagDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}// endclassGridBagDemo
