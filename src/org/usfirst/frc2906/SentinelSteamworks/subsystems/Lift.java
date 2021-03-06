// Commented by Ben N


package org.usfirst.frc2906.SentinelSteamworks.subsystems;

import org.usfirst.frc2906.SentinelSteamworks.RobotMap;
import org.usfirst.frc2906.SentinelSteamworks.commands.*;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Lift extends Subsystem {


	private final  SpeedController lift = RobotMap.liftMotor;

    public void initDefaultCommand() {

    }
    //Lifts the robot up.
    public void LiftUp() {
		lift.set(1.0);    
    }

    public void LiftUpSpeed(double speed) {
		lift.set(speed*1);   
    }
    
    public void LiftStop() {
    	lift.set(0.0);

    }
    
}

