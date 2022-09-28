
//Equipo 3
//27/09/22

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class MenuTest extends JFrame {
     privatefinalColor colorValues[] = 
    { Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};    
 privateJRadioButtonMenuItem colorItems[], fonts[];
    privateJCheckBoxMenuItem styleItems[];
    privateJLabel displayLabel;
   privateButtonGroup fontGroup, colorGroup;
    private in tstyle;
   
   public MenuTest()
    {
    super( "Using JMenus" );  

     JMenu fileMenu = newJMenu( "File");
   fileMenu.setMnemonic( 'F');

   JMenuItem aboutItem = newJMenuItem( "About...");
 aboutItem.setMnemonic( 'A');           fileMenu.add( aboutItem );             aboutItem.addActionListener(

  new ActionListener() { 
  publicvoidactionPerformed( ActionEvent event )
    {
    JOptionPane.showMessageDialog( MenuTest.this,
    "This is an example\nof using menus",
    "About", JOptionPane.PLAIN_MESSAGE);

  }
   
 }

  );

   JMenuItem exitItem = newJMenuItem( "Exit");
    exitItem.setMnemonic( 'x');             
       fileMenu.add( exitItem );                 
       exitItem.addActionListener() {
new ActionListener() 
         
         public void actionPerformed( ActionEvent event )
   {
    System.exit( 0);
   }

      }
    

   JMenuBar bar = newJMenuBar();              
        setJMenuBar( bar );                       
            bar.add( fileMenu );
JMenu formatMenu = newJMenu( "Format");  
   formatMenu.setMnemonic( 'r');
     String colors[] = { "Black", "Blue", "Red", "Green"};
   JMenu colorMenu = newJMenu( "Color");
   colorMenu.setMnemonic( 'C');
  colorItems = newJRadioButtonMenuItem[ colors.length ];
    colorGroup = newButtonGroup();             
    ItemHandler itemHandler = newItemHandler();
for( intcount = 0; count < colors.length; count++ ) {
  colorItems[ count ] =                       
     newJRadioButtonMenuItem( colors[ count ] );
    colorMenu.add( colorItems[ count ] );        
     colorGroup.add( colorItems[ count ] );      
     colorItems[ count ].addActionListener( itemHandle);

     colorItems[ 0].setSelected( true);
  formatMenu.add( colorMenu );
  formatMenu.addSeparator();
  String fontNames[] = { "Serif", "Monospaced", "SansSerif"};
  JMenu fontMenu = newJMenu( "Font");
  fontMenu.setMnemonic( 'n'); 

fonts = new JRadioButtonMenuItem[ fontNames.length ];
fontGroup = newButtonGroup();

 for( intcount = 0; count < fonts.length; count++ ) {
  fonts[ count ] = newJRadioButtonMenuItem( fontNames[ count ] );
 fontMenu.add( fonts[ count ] );                              
    fontGroup.add( fonts[ count ] );                             
     fonts[ count ].addActionListener( itemHandler );
}
  fonts[ 0].setSelected( true);
  fontMenu.addSeparator();

     String styleNames[] = { "Bold", "Italic"};

  styleItems = new JCheckBoxMenuItem[ styleNames.length ];

  StyleHandler styleHandler = newStyleHandler();

  for( intcount = 0; count < styleNames.length; count++ ) {
  styleItems[ count ] =                       
   newJCheckBoxMenuItem( styleNames[ count ] );
  fontMenu.add( styleItems[ count ] );         
     styleItems[ count ].addItemListener( styleHandler );
  }

  formatMenu.add( fontMenu );
  bar.add( formatMenu ); 

  displayLabel = newJLabel( "Sample Text", SwingConstants.CENTER);
  displayLabel.setForeground( colorValues[ 0] );
  displayLabel.setFont( newFont( "Serif", Font.PLAIN, 72) );
 
   getContentPane().setBackground( Color.CYAN);
  getContentPane().add( displayLabel, BorderLayout.CENTER);
  
  setSize( 500, 200);
  setVisible( true);
}
     publicstaticvoidmain( String args[] )
 {
  MenuTest application = newMenuTest();
  application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
  }  

   private class ItemHandler implements ActionListener {
    publicvoidactionPerformed( ActionEvent event )
      {
      for( intcount = 0; count < colorItems.length; count++ )
        if( colorItems[ count ].isSelected() ) {
      displayLabel.setForeground( colorValues[ count ] );
       break;   
      }

     for( intcount = 0; count < fonts.length; count++ )

 if( event.getSource() == fonts[ count ] ) {
  displayLabel.setFont( 
  newFont( fonts[ count ].getText(), style, 72) );
  break;
  }
repaint(); 
    }
   }

   privateclassStyleHandler implementsItemListener {
     publicvoiditemStateChanged( ItemEvent e )
       {
       tyle = 0;
 
  if( styleItems[ 0].isSelected() )
  style += Font.BOLD;

  if( styleItems[ 1].isSelected() )
  style += Font.ITALIC;
 displayLabel.setFont( 
  newFont( displayLabel.getFont().getName(), style, 72) );
       repaint();
       }
   }
