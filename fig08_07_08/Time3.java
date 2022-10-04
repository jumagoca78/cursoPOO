// Fig. 8.7: Time3.java
// Time3 class declaration with set and get methods.
import java.text.DecimalFormat;  

public class Time3 {
   private int hour;     // 0 - 23
   private int minute;   // 0 - 59
   private int second;   // 0 - 59

   // Time3 constructor initializes each instance variable to zero;
   // ensures that Time object starts in a consistent state
   public Time3() 
   { 
      this( 0, 0, 0 ); // invoke Time3 constructor with three arguments
   }

   // Time3 constructor: hour supplied, minute and second defaulted to 0
   public Time3( int h ) 
   { 
      this( h, 0, 0 ); // invoke Time3 constructor with three arguments
   }

   // Time3 constructor: hour and minute supplied, second defaulted to 0
   public Time3( int h, int m ) 
   { 
      this( h, m, 0 ); // invoke Time3 constructor with three arguments
   }

   // Time3 constructor: hour, minute and second supplied
   public Time3( int h, int m, int s ) 
   { 
      setTime( h, m, s ); 
   }

   // Time3 constructor: another Time3 object supplied
   public Time3( Time3 time )
   {
      // invoke Time3 constructor with three arguments
      this( time.getHour(), time.getMinute(), time.getSecond() );
   }

   // Set Methods
   // set a new time value using universal time; perform 
   // validity checks on data; set invalid values to zero
   public void setTime( int h, int m, int s )
   {
      setHour( h );   // set the hour
      setMinute( m ); // set the minute
      setSecond( s ); // set the second
   }

   // validate and set hour 
   public void setHour( int h ) 
   { 
      hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
   }

   // validate and set minute 
   public void setMinute( int m ) 
   { 
      minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
   }

   // validate and set second 
   public void setSecond( int s ) 
   { 
      second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
   }

   // Get Methods
   // get hour value
   public int getHour() 
   { 
      return hour; 
   }

   // get minute value
   public int getMinute() 
   { 
      return minute; 
   }

   // get second value
   public int getSecond() 
   { 
      return second; 
   }

   // convert to String in universal-time format
   public String toUniversalString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      return twoDigits.format( getHour() ) + ":" +
         twoDigits.format( getMinute() ) + ":" +
         twoDigits.format( getSecond() );
   }

   // convert to String in standard-time format
   public String toStandardString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      return ( ( getHour() == 12 || getHour() == 0 ) ? 
         12 : getHour() % 12 ) + ":" + twoDigits.format( getMinute() ) +
         ":" + twoDigits.format( getSecond() ) + 
         ( getHour() < 12 ? " AM" : " PM" );
   }

} // end class Time3


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
