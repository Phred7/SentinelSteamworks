package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTank extends Command {

		double leftSpeed;
		double rightSpeed;
    public DriveTank(double speed) {
    	leftSpeed = speed*-1.085;
    	rightSpeed = speed;
    	requires(Robot.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.driveTrain.tankDrive(leftSpeed, rightSpeed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
