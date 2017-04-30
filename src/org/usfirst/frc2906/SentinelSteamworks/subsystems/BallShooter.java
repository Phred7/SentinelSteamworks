package org.usfirst.frc2906.SentinelSteamworks.subsystems;

import org.usfirst.frc2906.SentinelSteamworks.Robot;
import org.usfirst.frc2906.SentinelSteamworks.RobotMap;
import org.usfirst.frc2906.SentinelSteamworks.commands.ScaleShoot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallShooter extends Subsystem {

	private final SpeedController ballShooter = RobotMap.ballShooter;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new ScaleShoot());
    }
    
    public void shoot(double speed) {
    	ballShooter.set(speed);
    	
    }
    
    public void scaleShoot() {
    	Robot.ballShooter.shoot(Robot.oi.getJoystick1ZR());
    }
    
    public void stopShoot() {
    	Robot.ballShooter.shoot(0.0);
    }
    
    public void getShooter() {
    	
    }
}

