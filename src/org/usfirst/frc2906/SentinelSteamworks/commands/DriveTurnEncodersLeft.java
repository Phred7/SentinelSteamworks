package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;
import org.usfirst.frc2906.SentinelSteamworks.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTurnEncodersLeft extends Command {
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
	
		
    public DriveTurnEncodersLeft(double speed, int userDegrees) {
    	requires(Robot.driveTrain);
    	botTurnRadius = 18;
    	wheelDia = 6;
    	botTurnC = (2*(Math.PI*botTurnRadius));
    	wheelC = 6*Math.PI;
    	distancePerDegree = (botTurnC/360); //assumed to be in inches only (not conversion yet)
    	pivotDriveDistance = (1/2)*(distancePerDegree)*userDegrees;
    	botSpeed = speed;
    	// 1/2 is for arcade drive pivot: it should be one half the distance since both wheels move equally
    	
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getRightDistance() + pivotDriveDistance;
    }

    protected void execute() {
    	Robot.driveTrain.arcadeDrive(botSpeed, 0.5); //may be 90 or -0.5 or 1
    	
    }

    protected boolean isFinished() {
        return (Robot.driveTrain.getRightDistance() >= endDistance); //MAY NEED TO ADD ABS TO FUNCTION PROPPERLY TESTING IS REQUIRED
    }

    protected void end() {
    	Robot.driveTrain.stop();
    }

    protected void interrupted() {
    }
}
