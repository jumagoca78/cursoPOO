
//Equipo 3
//27/09/22

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PopupTest extends JFrame {
   privateJRadioButtonMenuItem items[];
      privatefinalColor colorValues[] = 
   { Color.BLUE, Color.YELLOW,Color.RED};
    privateJPopupMenu popupMenu;
  
    public PopupTest()
    {
    super( "Using JPopupMenu");
   ItemHandler handler = newItemHandler();
    String colors[] = { "Blue", "Yellow", "Red"};

    ButtonGroup colorGroup = new ButtonGroup();
   popupMenu = new JPopupMenu();
    items = newJRadioButtonMenuItem[ 3];
      for( intcount = 0; count < items.length; count++ ) {
   items[ count ] = new JRadioButtonMenuItem( colors[ count ] );
    popupMenu.add( items[ count ] );
   colorGroup.add( items[ count ] );
   items[ count ].addActionListener( handler );
   }

  getContentPane().setBackground( Color.WHITE);
    addMouseListener(
      new MouseAdapter() {
      public void mousePressed( MouseEvent event )
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
      popupMenu.show(event.getComponent(), event.getX(), event.getY() );
        }
      }
      };
  
 set Size ( 300, 200);
 set Visible( true);
}

publicstaticvoidmain( String args[] )
   {
   PopupTest application = newPopupTest();
   application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
   }

private class ItemHandler implements ActionListener {
  
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