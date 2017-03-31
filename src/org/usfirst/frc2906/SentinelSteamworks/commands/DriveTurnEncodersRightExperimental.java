package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTurnEncodersRightExperimental extends Command {
	
	double botSpeed;
	double botTurnCircumference;
	double leftSpeed;
	double rightSpeed;
	double userDegrees;
	double endDistance;
	double driveDistance;
	double botTurnRadius;
	double totalDegrees; //factor, number of degrees in a circle
	double distancePerDegree; //assumed to be in inches only
	double pivotDriveDistance;

    public DriveTurnEncodersRightExperimental(double speed, double userDegrees) {
    	
        requires(Robot.driveTrain);
        requires(Robot.ballPickup);
        
        botSpeed = speed;
        botTurnRadius = 18;
        totalDegrees = 360.0;
        leftSpeed = botSpeed*-1;
    	rightSpeed = botSpeed*-1;
        botTurnCircumference = ((botTurnRadius)*(2.0)*(Math.PI));
        distancePerDegree = (((botTurnCircumference))/(totalDegrees));
        pivotDriveDistance = ((distancePerDegree)*(userDegrees));
        
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getRightDistance() + pivotDriveDistance;
    }

    protected void execute() {
    	Robot.driveTrain.tankDrive(leftSpeed, rightSpeed);
    	Robot.ballPickup.drive(rightSpeed);
    	
    }

    protected boolean isFinished() {
        return (Robot.driveTrain.getRightDistance() >= endDistance); //MAY NEED TO ADD ABS TO FUNCTION PROPERLY TESTING IS REQUIRED
    }

    protected void end() {
    	Robot.driveTrain.stop();
    	Robot.driveTrain.stop();
    }

    protected void interrupted() {
    }
}