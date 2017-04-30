package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithXboxTank extends Command {

    public DriveWithXboxTank() {
    	requires(Robot.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.driveTrain.driveWithJoysticks3();
    }
    
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
