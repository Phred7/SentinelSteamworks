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
	
	public void drive(double speed){
		pickup.set(speed);
	}
	
	public void stop(){
		pickup.set(0.0);
	}
}

