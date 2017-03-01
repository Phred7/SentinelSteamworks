//Commented by Ben N

package org.usfirst.frc2906.SentinelSteamworks.subsystems;

import org.usfirst.frc2906.SentinelSteamworks.Robot;
import org.usfirst.frc2906.SentinelSteamworks.RobotMap;
import org.usfirst.frc2906.SentinelSteamworks.commands.*;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


public class BallPickup extends Subsystem {

    
    private final SpeedController pickup = RobotMap.ballPickupPickup;


    public void initDefaultCommand() {
    
    }

    //This pushes the ball out speed of 100%.
    public void BallPickUpOut() {
    	pickup.set(-1.0);
    	
    }
    //motor off.
    public void BallPickUpOff() {
    	pickup.set(0);
    
    }
    
    public void BallPickUpIn() {
    	pickup.set(.5);
    }
}

