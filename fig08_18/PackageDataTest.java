// Fig. 8.18: PackageDataTest.java
// Classes in the same package (i.e., the same directory) can
// use package access data of other classes in the same package.
import javax.swing.JOptionPane;

public class PackageDataTest {

   public static void main( String args[] )
   {
      PackageData packageData = new PackageData();

      // append String representation of packageData to output
      String output = "After instantiation:\n" + 
         packageData.toPackageDataString();

      // change package access data in packageData object
      packageData.number = 77;     
      packageData.string = "Goodbye";

      // append String representation of packageData to output
      output += "\nAfter changing values:\n" + 
         packageData.toPackageDataString();

      JOptionPane.showMessageDialog( null, output, "Package Access", 
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // end class PackageDataTest

// class with package access instance variables
class PackageData {
   int number;     // package-access instance variable
   String string;  // package-access instance variable

   // constructor
   public PackageData() 
   { 
      number = 0; 
      string = "Hello";
   }               

   // return PackageData object String representation
   public String toPackageDataString() 
   {
      return "number: " + number + "    string: " + string;
   }

} // end class PackageData


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
