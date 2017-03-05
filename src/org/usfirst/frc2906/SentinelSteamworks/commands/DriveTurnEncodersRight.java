package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTurnEncodersRight extends Command {
	
	int ftDistance;
	int inDistance;
	int driveDistance;
	double endDistance;
	double botSpeed;
	double leftSpeed;
	double rightSpeed;

    public DriveTurnEncodersRight(double speed, int userFeet, int userInches) {

    	requires(Robot.driveTrain);
    	
    	driveDistance = (userInches + (12 * userFeet));
    	botSpeed = speed;
    	leftSpeed = botSpeed*-1.0;
    	rightSpeed = botSpeed*-1.0;
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getRightDistance() - driveDistance;
    }

    protected void execute() {
    	Robot.driveTrain.tankDrive(leftSpeed, rightSpeed);
    }

    protected boolean isFinished() {
        return (Robot.driveTrain.getRightDistance() <= endDistance);
    }

    protected void end() {
    	Robot.driveTrain.stop();
    }

    protected void interrupted() {
    }
	/*
	int driveDistance;
	int botTurnRadius;
	int wheelDia;	
	int userDegrees;
	double botSpeed;
	double botTurnC;
	double endDistance;
	double pivotDriveDist;
	double distancePerDegree; //assumed to be in inches only
	double wheelC;
	double leftSpeed;
	double rightSpeed;
    public DriveTurnEncodersRight(double speed, int userDegrees, double pivotDriveDistance) {

    	requires(Robot.driveTrain);
    	botTurnRadius = 18;
    	wheelDia = 6;
    	botTurnC = (2*(Math.PI*botTurnRadius));
    	wheelC = 6*Math.PI;
    	distancePerDegree = (botTurnC/360); //assumed to be in inches only (not conversion yet)
    	pivotDriveDist =   pivotDriveDistance; //(1.0/2.0)*(distancePerDegree)*userDegrees;//pivotDriveDistance;
    	leftSpeed = speed;
    	rightSpeed = speed;
    	
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getRightDistance() + pivotDriveDist;
    }

    protected void execute() {
    	Robot.driveTrain.tankDrive(leftSpeed, rightSpeed);
    }

    protected boolean isFinished() {
        return (Robot.driveTrain.getRightDistance() >= endDistance); //MAY NEED TO CHANGE ALL ABS TO GET THIS TO WORK OR JUST REMOVE IT
    }

    protected void end() {
    	Robot.driveTrain.stop();
    	
    }

    protected void interrupted() {
    }*/
}
