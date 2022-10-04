// Fig. 8.16: Time1.java
// Time1 class declaration maintains the time in 24-hour format.
package com.deitel.jhtp5.ch08;

import java.text.DecimalFormat; 

public class Time1 extends Object {
   private int hour;     // 0 - 23
   private int minute;   // 0 - 59
   private int second;   // 0 - 59

   // Time1 constructor initializes each instance variable to zero; 
   // ensures that each Time1 object starts in a consistent state
   public Time1()
   {
      setTime( 0, 0, 0 );
   }

   // set a new time value using universal time; perform 
   // validity checks on the data; set invalid values to zero
   public void setTime( int h, int m, int s )
   {
      hour = ( ( h >= 0 && h < 24 ) ? h : 0 );
      minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
      second = ( ( s >= 0 && s < 60 ) ? s : 0 );
   }

   // convert to String in universal-time format
   public String toUniversalString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      return twoDigits.format( hour ) + ":" +
         twoDigits.format( minute ) + ":" + twoDigits.format( second );
   }

   // convert to String in standard-time format
   public String toStandardString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );
      
      return ( (hour == 12 || hour == 0) ? 12 : hour % 12 ) + ":" + 
         twoDigits.format( minute ) + ":" + twoDigits.format( second ) +
         ( hour < 12 ? " AM" : " PM" );
   }

} // end class Time1

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
