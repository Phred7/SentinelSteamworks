package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;
import org.usfirst.frc2906.SentinelSteamworks.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class DriveTurnEncodersLeft extends Command {
	int ftDistance;
	int inDistance;
	int driveDistance;
	double endDistance;
	double botSpeed;
	double leftSpeed;
	double rightSpeed;

    public DriveTurnEncodersLeft(double speed, int userFeet, int userInches) {

    	requires(Robot.driveTrain);
    	
    	driveDistance = (userInches + (12 * userFeet));
    	botSpeed = speed;
    	leftSpeed = botSpeed;
    	rightSpeed = botSpeed;
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getRightDistance() + driveDistance;
    }

    protected void execute() {
    	Robot.driveTrain.tankDrive(leftSpeed, rightSpeed);
    }

    protected boolean isFinished() {
        return (Robot.driveTrain.getRightDistance() >= endDistance);
    }

    protected void end() {
    	Robot.driveTrain.stop();
    }

    protected void interrupted() {
    }
}
