package org.usfirst.frc.team2500.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Talon;


public class Autonomous extends IterativeRobot {
    /**
     * This function is run once each time the robot enters autonomous mode
     */
	Begin begin = Robot.begin;
	
    public void autonomousInit() {
    	Begin.autoLoopCounter = 0;
	    
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
//    	if(begin.eCodeLeft.getRaw() < 1000){
//    		
//    	}
//    	else{
//    	
//    	}
    }
}