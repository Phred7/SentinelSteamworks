//Commented by DeMarco Best II in 2017


package org.usfirst.frc2906.SentinelSteamworks.subsystems;

import org.usfirst.frc2906.SentinelSteamworks.Robot;
import org.usfirst.frc2906.SentinelSteamworks.RobotMap;
import org.usfirst.frc2906.SentinelSteamworks.commands.*;
import edu.wpi.first.wpilibj.RobotDrive;
//import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

	private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

	public void initDefaultCommand() {

		setDefaultCommand(new DriveWithJoysticks());
	}

	public void arcadeDrive(double move, double rotate) {
		robotDrive.arcadeDrive(move, rotate);
	}

	public void tankDrive(double left, double right) {
		robotDrive.tankDrive(left, right);
	}
	
	public double getLeftDistance() {
		return RobotMap.encoderLeft.getDistance();
	}
	
	public double getRightDistance() {
		return RobotMap.encoderRight.getDistance();
	}
/*
	public void driveWithJoysticks() {
		robotDrive.arcadeDrive(Robot.oi.getJoystick1X(), Robot.oi.getJoystick1Y());
	}
*/	/*
	public void driveWithJoysticks() {
		robotDrive.tankDrive(Robot.oi.getJoystick3Y(), Robot.oi.getJoystick4Y());
	} */
	
	public void driveWithJoysticks() {
		robotDrive.tankDrive(Robot.oi.getJoystick5Y(), Robot.oi.getJoystick5Z());
	}
/*
	public void driveStraightEncs(double speed, int userFeet, int userInches) {
		int calculatedTicks = (userFeet * tift) + (userInches * tinch);
		while (Robot.leftDrive.get() <= Math.abs(calculatedTicks)) {
			Robot.driveTrain.tankDrive(speed, speed);
		}
	}

	public void turnLeftEncs(int degrees) {
		int calculatedTicks = (degrees*(tpd/2));
		while(Robot.rightDrive.get() <= Math.abs(calculatedTicks)) {
			Robot.driveTrain.tankDrive(-.4, .4);
		}
	}

	public void turnRightEnc(int degrees) {
		int calculatedTicks = (degrees*(tpd/2));
		while(Robot.leftDrive.get() <= Math.abs(calculatedTicks)) {
			Robot.driveTrain.tankDrive(.4, -.4);
		}
	}

	public void turnFullEncs(int degrees) {

	}
	*/
	public void ResetEncoders(){
		RobotMap.encoderLeft.reset();
		RobotMap.encoderRight.reset();
	}
	
	public void stop() {
		robotDrive.arcadeDrive(0.0, 0.0);
		robotDrive.tankDrive(0.0, 0.0);
	}
}