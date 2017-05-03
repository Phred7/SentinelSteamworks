package org.usfirst.frc2906.SentinelSteamworks.subsystems;


import org.usfirst.frc2906.SentinelSteamworks.Robot;
import org.usfirst.frc2906.SentinelSteamworks.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallShooter extends Subsystem {

	SpeedController ballShooter = RobotMap.ballShooter;

    public void initDefaultCommand() {
        ballShooter = RobotMap.ballShooter;
        ballShooter.set(Robot.oi.getJoystick1Z());
    }
    
    public void stopShoot() {
    	ballShooter.set(0.0);
    }
    
    public void sFullShoot() {
    	ballShooter.set(1.0);
    }
    
    public void scaleShoot() {
    	ballShooter.set(Robot.oi.getJoystick1Z());
    }
}

