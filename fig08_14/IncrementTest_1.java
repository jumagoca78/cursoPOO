// Fig. 8.14: IncrementTest.java
// Initializing a final variable.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncrementTest extends JApplet implements ActionListener {
   private Increment incrementObject;
   private JButton button;  

   // set up GUI
   public void init() 
   { 
      incrementObject = new Increment( 5 );

      Container container = getContentPane();

      button = new JButton( "Click to increment" );
      button.addActionListener( this );
      container.add( button );
   }

   // add INCREMENT to total when user clicks button
   public void actionPerformed( ActionEvent actionEvent )
   {
      incrementObject.increment();
      showStatus( incrementObject.toIncrementString() );
   }

} // end class Increment

// class containing constant variable
class Increment {
   private int count = 0;       // number of increments
   private int total = 0;       // total of all increments
   private final int INCREMENT; // constant variable

   // initialize constant INCREMENT
   public Increment( int incrementValue )
   {
      INCREMENT = incrementValue; // intialize constant variable (once)
   }

   // add INCREMENT to total and add 1 to count
   public void increment()
   {
      total += INCREMENT;
      ++count;
   }

   // return String representation of an Increment object's data
   public String toIncrementString()
   {
      return "After increment " + count + ": total = " + total;
   }

} // end class IncrementTest


/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
