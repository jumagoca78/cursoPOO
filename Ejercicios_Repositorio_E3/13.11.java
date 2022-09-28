
//Equipo 3
//27/09/22
// Fig. 13.11: CheckBoxTest.java2 
// Creating JCheckBox buttons.

importjava.awt.*;
 importjava.awt.event.*;
 importjavax.swing.*;
  publicclassCheckBoxTest extendsJFrame {
 privateJTextField field;
 privateJCheckBox bold, italic;

 // set up GUI
publicCheckBoxTest()
 {
 super( "JCheckBox Test");
// get content pane and set its layout
 Container container = getContentPane();
 container.setLayout( newFlowLayout() );

// set up JTextField and set its font
 field = newJTextField( "Watch the font style change", 20);
 field.setFont( newFont( "Serif", Font.PLAIN, 14) );
 container.add( field );

// create checkbox objects26 bold = newJCheckBox( "Bold");
container.add( bold ); 

 italic = newJCheckBox( "Italic");
container.add( italic );
 
// register listeners for JCheckBoxes 
 CheckBoxHandler handler = newCheckBoxHandler();
bold.addItemListener( handler ); 
 italic.addItemListener( handler ); 

 setSize( 275, 100);
setVisible( true);
 
} // end CheckBoxText constructor

 publicstaticvoidmain( String args[] )
 { 
CheckBoxTest application = newCheckBoxTest();
 application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
}

// private inner class for ItemListener event handling
 privateclassCheckBoxHandler implementsItemListener {
privateintvalBold = Font.PLAIN;
 privateintvalItalic = Font.PLAIN;
 
 // respond to checkbox events
publicvoiditemStateChanged( ItemEvent event )
 {
 // process bold checkbox events
 if( event.getSource() == bold )
 valBold = bold.isSelected() ? Font.BOLD: Font.PLAIN;

 // process italic checkbox events
 if( event.getSource() == italic )
 valItalic = italic.isSelected() ? Font.ITALIC: Font.PLAIN;
 
 // set text field font
 field.setFont( newFont( "Serif", valBold + valItalic, 14) );
 
 } // end method itemStateChanged6

 } // end private inner class CheckBoxHandler

 } // end class CheckBoxTest


