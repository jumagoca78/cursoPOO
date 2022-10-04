// Fig. 8.6: TimeTest3.java
// Overloaded constructors used to initialize Time2 objects.
import javax.swing.*;

public class TimeTest3 {

   public static void main( String args[] )
   {
      Time2 t1 = new Time2();              // 00:00:00
      Time2 t2 = new Time2( 2 );           // 02:00:00
      Time2 t3 = new Time2( 21, 34 );      // 21:34:00
      Time2 t4 = new Time2( 12, 25, 42 );  // 12:25:42
      Time2 t5 = new Time2( 27, 74, 99 );  // 00:00:00
      Time2 t6 = new Time2( t4 );          // 12:25:42

      String output = "Constructed with: " +
         "\nt1: all arguments defaulted" +
         "\n      " + t1.toUniversalString() +
         "\n      " + t1.toStandardString();

      output += "\nt2: hour specified; minute and second defaulted" +
         "\n      " + t2.toUniversalString() +
         "\n      " + t2.toStandardString();

      output += "\nt3: hour and minute specified; second defaulted" +
         "\n      " + t3.toUniversalString() +
         "\n      " + t3.toStandardString();

      output += "\nt4: hour, minute and second specified" +
         "\n      " + t4.toUniversalString() +
         "\n      " + t4.toStandardString();

      output += "\nt5: all invalid values specified" +
         "\n      " + t5.toUniversalString() +
         "\n      " + t5.toStandardString();

      output += "\nt6: Time2 object t4 specified" +
         "\n      " + t6.toUniversalString() +
         "\n      " + t6.toStandardString();

      JOptionPane.showMessageDialog( null, output,
         "Overloaded Constructors", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   } // end main

} // end class TimeTest3


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
