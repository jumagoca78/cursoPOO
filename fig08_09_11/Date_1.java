// Fig. 8.9: Date.java 
// Date class declaration.

public class Date {
   private int month;  // 1-12
   private int day;    // 1-31 based on month
   private int year;   // any year

   // constructor: call checkMonth to confirm proper value for month; 
   // call checkDay to confirm proper value for day
   public Date( int theMonth, int theDay, int theYear )
   {
      month = checkMonth( theMonth ); // validate month
      year = theYear;                 // could validate year
      day = checkDay( theDay );       // validate day

      System.out.println( "Date object constructor for date " + 
         toDateString() );

   } // end Date constructor

   // utility method to confirm proper month value
   private int checkMonth( int testMonth )
   {
      if ( testMonth > 0 && testMonth <= 12 )  // validate month
         return testMonth;

      else { // month is invalid
         System.out.println( "Invalid month (" + testMonth + 
            ") set to 1." );
         return 1;  // maintain object in consistent state
      }

   } // end method checkMonth

   // utility method to confirm proper day value based on month and year
   private int checkDay( int testDay )
   {
      int daysPerMonth[] = 
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   
      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
   
      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
   
      System.out.println( "Invalid day (" + testDay + ") set to 1." );
   
      return 1;  // maintain object in consistent state

   } // end method checkDay
   
   // return a String of the form month/day/year
   public String toDateString()
   { 
      return month + "/" + day + "/" + year; 
   }

} // end class Date


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
