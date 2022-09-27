// ElevatorController.java
// Controller for Elevator Simulation
package com.deitel.jhtp5.elevator.controller;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

import com.deitel.jhtp5.elevator.model.*;
import com.deitel.jhtp5.elevator.event.*;
import com.deitel.jhtp5.elevator.ElevatorConstants;

public class ElevatorControllerextendsJPanel
implements ElevatorConstants {

    // controller contains two JButtons
    private JButton firstControllerButton;
    private JButton secondControllerButton;
    private ElevatorSimulation elevatorSimulation;
    public ElevatorConstants( ElevatorSimulation simulation ) {
        elevatorSimulation = simulation;
        setBackground( Color.WHITE );
        // add first button to controller
     firstControllerButton = new JButton( "First Floor" ); add(firstControllerButton);
        // add second button to controller
     secondControllerButton = new JButton( "Second Floor" ); add(secondControllerButton);
     // anonymous inner class registers to receive ActionEvents // from first Controller JButton firstControllerButton.addActionListener(
           new ActionListener() {
              // invoked when a JButton has been pressed
     public void actionPerformed( ActionEvent event ) {
                 // place Person on first Floor
                 elevatorSimulation.addPerson(FIRST_FLOOR_NAME);
                 // disable user input
                 firstControllerButton.setEnabled( false ); }
                } // end anonymous inner class
                );
                new ActionListener() {
                    public void actionPerformed( ActionEvent event ) {
                        elevatorSimulation.addPerson(SECOND_FLOOR_NAME );
                        secondControllerButton.setEnabled( false ); }
} 
);
elevatorSimulation.addPersonMoveListener(
new PersonMoveListener() {
    public void personEntered(PersonMoveEvent event )
{
    String location = event.getLocation().getLocationName();
    if ( location.equals( FIRST_FLOOR_NAME ) )
    firstControllerButton.setEnabled( true );
    else
    secondControllerButton.setEnabled( true );
} // end method personEntered 96
// other methods implementing PersonMoveListener
public void personCreated(PersonMoveEvent event ){}
public void personArrived(
            PersonMoveEvent event ) {}
         public void personExited(
            PersonMoveEvent event ) {}
         public void personDeparted(
            PersonMoveEvent event ) {}
         public void personPressedButton(
            PersonMoveEvent event ) {}
      } // end anonymous inner class
   );
} // end ElevatorController constructor
}
// ElevatorConstants.java
// Constants used between ElevatorModel and ElevatorView package com.deitel.jhtp5.elevator;
public interface ElevatorConstants {
public static final String FIRST_FLOOR_NAME = "firstFloor"; 
public static final String SECOND_FLOOR_NAME = "secondFloor"; 
public static final String ELEVATOR_NAME = "elevator";