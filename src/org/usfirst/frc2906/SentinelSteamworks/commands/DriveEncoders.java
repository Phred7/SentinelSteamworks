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
	double leftSpeed;
	double rightSpeed;

    public DriveEncoders(double speed, int userFeet, int userInches) {

    	requires(Robot.driveTrain);
    	requires(Robot.ballPickup);
    	
    	driveDistance = (userInches + (12 * userFeet));
    	botSpeed = speed;
    	leftSpeed = botSpeed*-1.075;
    	rightSpeed = botSpeed*1.0;
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getRightDistance() + driveDistance;
    }

    protected void execute() {
    	Robot.driveTrain.tankDrive(leftSpeed, rightSpeed);
    	Robot.ballPickup.drive(rightSpeed);
    }

    protected boolean isFinished() {
        return (Robot.driveTrain.getRightDistance() >= endDistance);
    }

    protected void end() {
    	Robot.driveTrain.stop();
    	Robot.ballPickup.stop();
    	
    }

    protected void interrupted() {
    }
}
