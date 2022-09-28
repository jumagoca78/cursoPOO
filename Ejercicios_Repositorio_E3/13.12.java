
//Equipo 3
//27/09/22
// Fig. 13.12: RadioButtonTest.java
// Creating radio buttons using ButtonGroup and JRadioButton.

 importjava.awt.*;
importjava.awt.event.*;
importjavax.swing.*;
 
 publicclassRadioButtonTest extendsJFrame {
 privateJTextField field;
 privateFont plainFont, boldFont, italicFont, boldItalicFont;
privateJRadioButton plainButton, boldButton, italicButton,
boldItalicButton; 
privateButtonGroup radioGroup; 

// create GUI and fonts
 publicRadioButtonTest()
{
 super( "RadioButton Test");

// get content pane and set its layout
 Container container = getContentPane();
container.setLayout( newFlowLayout() );

 // set up JTextField
field = newJTextField( "Watch the font style change", 25);
 container.add( field ); 

// create radio buttons
 plainButton = newJRadioButton( "Plain", true);
 container.add( plainButton );
 
boldButton = newJRadioButton( "Bold", false);
container.add( boldButton );

italicButton = newJRadioButton( "Italic", false);
container.add( italicButton );

boldItalicButton = newJRadioButton( "Bold/Italic", false);
container.add( boldItalicButton );

// create logical relationship between JRadioButtons
 radioGroup = newButtonGroup(); 
radioGroup.add( plainButton ); 
radioGroup.add( boldButton ); 
radioGroup.add( italicButton ); 
radioGroup.add( boldItalicButton ); 

 // create font objects
 plainFont = newFont( "Serif", Font.PLAIN, 14);
boldFont = newFont( "Serif", Font.BOLD, 14);
italicFont = newFont( "Serif", Font.ITALIC, 14);
boldItalicFont = newFont( "Serif", Font.BOLD+ Font.ITALIC, 14);
field.setFont( plainFont ); // set initial font 

// register events for JRadioButtons 
plainButton.addItemListener( newRadioButtonHandler( plainFont ) );
boldButton.addItemListener( newRadioButtonHandler( boldFont ) ); 
italicButton.addItemListener( 
newRadioButtonHandler( italicFont ) ); 
boldItalicButton.addItemListener( 
newRadioButtonHandler( boldItalicFont ) ); 

setSize( 300, 100);
setVisible( true);

} // end RadioButtonTest constructor
 
publicstaticvoidmain( String args[] )
 {
RadioButtonTest application = newRadioButtonTest();
application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
} 

// private inner class to handle radio button events
 Private class RadioButtonHandler implements ItemListener {
privateFont font;
 
publicRadioButtonHandler( Font f )
 {
font = f;
 } // handle radio button events
 publicvoiditemStateChanged( ItemEvent event )
 {
 field.setFont( font );
} 
} // end private inner class RadioButtonHandler
 } // end class RadioButtonTest




