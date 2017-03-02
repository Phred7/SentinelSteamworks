package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTurnEncodersRight extends Command {
	int driveDistance;
	int botTurnRadius;
	int wheelDia;	
	int userDegrees;
	double botSpeed;
	double botTurnC;
	double endDistance;
	double pivotDriveDistance;
	double distancePerDegree; //assumed to be in inches only
	double wheelC;
	double leftSpeed;
	double rightSpeed;
    public DriveTurnEncodersRight(double speed, int userDegrees) {

    	requires(Robot.driveTrain);
    	botTurnRadius = 18;
    	wheelDia = 6;
    	botTurnC = (2*(Math.PI*botTurnRadius));
    	wheelC = 6*Math.PI;
    	distancePerDegree = (botTurnC/360); //assumed to be in inches only (not conversion yet)
    	pivotDriveDistance = (1/2)*(distancePerDegree)*userDegrees;
    	leftSpeed = speed;
    	rightSpeed = speed*-1;
    	
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getRightDistance() + pivotDriveDistance;
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
    }
}
