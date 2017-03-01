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
    public DriveTurnEncodersRight(double speed, int userDegrees) {

    	requires(Robot.driveTrain);
    	botTurnRadius = 18;
    	wheelDia = 6;
    	botTurnC = (2*(Math.PI*botTurnRadius));
    	wheelC = 6*Math.PI;
    	distancePerDegree = (botTurnC/360); //assumed to be in inches only (not conversion yet)
    	pivotDriveDistance = (1/2)*(distancePerDegree)*userDegrees;
    	botSpeed = speed;
    }

    protected void initialize() {
    	endDistance = Robot.driveTrain.getLeftDistance() + pivotDriveDistance;
    }

    protected void execute() {
    	Robot.driveTrain.arcadeDrive(botSpeed, -0.5);
    }

    protected boolean isFinished() {
        return ((Math.abs(Robot.driveTrain.getLeftDistance())) >= endDistance); //MAY NEED TO CHANGE ALL ABS TO GET THIS TO WORK OR JUST REMOVE IT
    }

    protected void end() {
    	Robot.driveTrain.stop();
    	
    }

    protected void interrupted() {
    }
}
