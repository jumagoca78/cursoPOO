// Fig. 8.13: EmployeeTest.java
// Test Employee class with static class variable,
// static class method, and dynamic memory.
import javax.swing.*;

public class EmployeeTest {

   public static void main( String args[] )
   {
      // prove that count is 0 before creating Employees
      String output = "Employees before instantiation: " +
         Employee.getCount();

      // create two Employees; count should be 2
      Employee e1 = new Employee( "Susan", "Baker" );
      Employee e2 = new Employee( "Bob", "Jones" );
   
      // prove that count is 2 after creating two Employees
      output += "\n\nEmployees after instantiation: " +
         "\nvia e1.getCount(): " + e1.getCount() +
         "\nvia e2.getCount(): " + e2.getCount() +
         "\nvia Employee.getCount(): " + Employee.getCount();
   
      // get names of Employees
      output += "\n\nEmployee 1: " + e1.getFirstName() +
         " " + e1.getLastName() + "\nEmployee 2: " + 
         e2.getFirstName() + " " + e2.getLastName();

      // decrement reference count for each Employee object; in this 
      // example, there is only one reference to each Employee, so these
      // statements mark each Employee object for garbage collection
      e1 = null; 
      e2 = null;  

      System.gc(); // suggest call to garbage collector

      // show Employee count after calling garbage collector; count 
      // displayed may be 0, 1 or 2 based on whether garbage collector
      // executes immediately and number of Employee objects collected
      output += "\n\nEmployees after System.gc(): " + 
         Employee.getCount();

      JOptionPane.showMessageDialog( null, output,
         "Static Members", JOptionPane.INFORMATION_MESSAGE );

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
