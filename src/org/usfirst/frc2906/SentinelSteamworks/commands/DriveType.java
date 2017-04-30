package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveType extends Command {
public static double drive;
    public DriveType() {
    	requires(Robot.driveTrain);
    
    }

    protected void initialize() {
    /*	if (Robot.driveType == driveWithXboxTank)
     * 
     * else if (Robot.driveType == driveWithDoubleJoysticks)
     * 
     * else
    	Robot.driveTrain.driveWithJoysticks();
     */
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
