package org.usfirst.frc2906.SentinelSteamworks.subsystems;

import org.usfirst.frc2906.SentinelSteamworks.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallShooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final  SpeedController shooter = RobotMap.ballShooter;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Shoot(){
    	shooter.set(1.0);
    }
    
    public void ShootOff() {
    	shooter.set(0.0);
    }
    
    public void ShootReverse() {
    	shooter.set(-.3);
    }
}
