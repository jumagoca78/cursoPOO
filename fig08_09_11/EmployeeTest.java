// Fig. 8.11: EmployeeTest.java
// Demonstrating an object with a member object.
import javax.swing.JOptionPane;

public class EmployeeTest {

   public static void main( String args[] )
   {
      Date birth = new Date( 7, 24, 1949 );
      Date hire = new Date( 3, 12, 1988 );
      Employee employee = new Employee( "Bob", "Jones", birth, hire );

      JOptionPane.showMessageDialog( null, employee.toEmployeeString(), 
         "Testing Class Employee", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // end class EmployeeTest



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
