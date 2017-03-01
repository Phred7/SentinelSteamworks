package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveEncoders extends Command {
	int ftDistance;
	int inDistance;
	int driveDistance;
	double endDistance;
	double botSpeed;

    public DriveEncoders(double speed, int userFeet, int userInches) {

    	requires(Robot.driveTrain);
    	
    	driveDistance = userInches + (12 * userFeet);
    	botSpeed = speed;
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getLeftDistance() + driveDistance;
    }

    protected void execute() {
    	Robot.driveTrain.arcadeDrive(botSpeed, 0);
    }

    protected boolean isFinished() {
        return (Robot.driveTrain.getLeftDistance() >= endDistance);
    }

    protected void end() {
    	Robot.driveTrain.stop();
    }

    protected void interrupted() {
    }
}
