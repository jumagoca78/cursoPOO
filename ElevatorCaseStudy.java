package com.deitel.jhtp5.elevator;
import java.awt.*;
import javax.swing.*;
//Deitelpackages
import com.deitel.jhtp5.elevator.model.*;
import com.deitel.jhtp5.elevator.view.*;
import com.deitel.jhtp5.elevator.controller.*;
public class ElevatorCaseStudyextendsJFrame{
// model, view and controller
private ElevatorSimulation model;
private ElevatorView view;
private ElevatorController controller;
// constructor instantiates model, view, and controller
public class ElevatorCaseStudyextendsJFrame{
    private ElevatorSimulation model;
    private ElevatorView view;
    private ElevatorController controller;
    public ElevatorCaseStudy()
{
    super( "Deitel Elevator Simulation" );
    model = new ElevatorSimulation();
    view = new ElevatorView();
    controller = new ElevatorController( model );
    model.setElevatorSimulationListener( view );
    getContentPane().add( view, BorderLayout.CENTER );
    getContentPane().add( controller, BorderLayout.SOUTH );
} // end ElevatorCaseStudy constructor 41
// main method starts program
public static void main( String args[] )
{
// instantiate ElevatorCaseStudy
ElevatorCaseStudy simulation = new ElevatorCaseStudy();
simulation.setDefaultCloseOperation( EXIT_ON_CLOSE );
simulation.pack();
simulation.setVisible( true );
}
}