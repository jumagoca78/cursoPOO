
//Equipo 3
//27/09/22
//Ejercicio Jbutton 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame{
  private JButton plainButton, fancyButton;

  public Main (){
  super( "Testing Buttons");     
  // get content pane and set its layout   
  Container container = getContentPane();
  container.setLayout( new FlowLayout() );
  // create buttons 
  
plainButton = new JButton("Plain Button");
container.add( plainButton );   
Icon bug1 = new ImageIcon( "bug1.gif");
Icon bug2 = new ImageIcon( "bug2.gif");
fancyButton = new JButton( "Fancy Button", bug1 );
fancyButton.setRolloverIcon( bug2 );       
container.add( fancyButton );
// create an instance of inner class ButtonHandler
// to use for button event handling 
ButtonHandler handler = new ButtonHandler();
fancyButton.addActionListener( handler );           plainButton.addActionListener( handler );         
setSize( 275, 100);
setVisible( true);
  
  
  }
  
  public static void main(String[] args) {
    Main application = new Main();    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
    
  }
private class ButtonHandler implements ActionListener {
// handle button event    
public void actionPerformed( ActionEvent event )  {
  
  JOptionPane.showMessageDialog( Main.this, "You pressed: "+ event.getActionCommand() );
}
}
}