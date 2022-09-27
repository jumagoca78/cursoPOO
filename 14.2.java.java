importjava.awt.*;
importjava.awt.event.*;
importjavax.swing.*;

publicclassPopupTest extendsJFrame {
   privateJRadioButtonMenuItem items[];
      privatefinalColor colorValues[] = 
   { Color.BLUE, Color.YELLOW,Color.RED};
    privateJPopupMenu popupMenu;
  
    publicPopupTest()
    {
    super( "Using JPopupMenus");
   ItemHandler handler = newItemHandler();
    String colors[] = { "Blue", "Yellow", "Red"};

    ButtonGroup colorGroup = newButtonGroup();
   popupMenu = newJPopupMenu();
    items = newJRadioButtonMenuItem[ 3];
      for( intcount = 0; count < items.length; count++ ) {
   items[ count ] = newJRadioButtonMenuItem( colors[ count ] );
    popupMenu.add( items[ count ] );
   colorGroup.add( items[ count ] );
   items[ count ].addActionListener( handler );
   }

  getContentPane().setBackground( Color.WHITE);
    addMouseListener(
      new MouseAdapter() {
      Public void mousePressed( MouseEvent event )
        {
         checkForTriggerEvent( event ); 
        }
  publicvoidmouseReleased( MouseEvent event )
        {
          checkForTriggerEvent( event );
        }
  privatevoidcheckForTriggerEvent( MouseEvent event )
        {
          if( event.isPopupTrigger() )                      
      popupMenu.show(                             event.getComponent(), event.getX(), event.getY() );
        }
      }
      };
  
 setSize( 300, 200);
 setVisible( true);
}

publicstaticvoidmain( String args[] )
   {
   PopupTest application = newPopupTest();
   application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
   }

privateclassItemHandler implementsActionListener {
  
public void actionPerformed( ActionEvent event)
  {
    for( inti = 0; i < items.length; i++ )
    if( event.getSource() == items[ i ] ) {
    getContentPane().setBackground( colorValues[ i ] );
    return;
   } 
  }

}

}