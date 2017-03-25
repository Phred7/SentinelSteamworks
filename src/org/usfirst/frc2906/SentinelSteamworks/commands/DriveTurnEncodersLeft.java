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
	
		
    public DriveTurnEncodersLeft(double speed, int userDegrees, double pivotDriveDistance) {
    	requires(Robot.driveTrain);
    	botTurnRadius = 18;
    	wheelDia = 6;
    	botTurnC = (2*(Math.PI*botTurnRadius));
    	wheelC = 6*Math.PI;
    	distancePerDegree = (botTurnC/360); //assumed to be in inches only (not conversion yet)
    	pivotDriveDist = (1.0/2.0)*(distancePerDegree)*userDegrees;
    	botSpeed = speed;
    	leftSpeed = botSpeed*-1;
    	rightSpeed = botSpeed*-1;
    	// 1/2 is for arcade drive pivot: it should be one half the distance since both wheels move equally
    	
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getRightDistance() - pivotDriveDist;
    }

    protected void execute() {
    	Robot.driveTrain.tankDrive(leftSpeed, rightSpeed);
    	
    }

    protected boolean isFinished() {
        return (Robot.driveTrain.getRightDistance() >= endDistance); //MAY NEED TO ADD ABS TO FUNCTION PROPPERLY TESTING IS REQUIRED
    }

    protected void end() {
    	Robot.driveTrain.stop();
    }

    protected void interrupted() {
    }
    */
}
