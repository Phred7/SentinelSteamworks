package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoTestDriveOnly extends CommandGroup {

	public AutoTestDriveOnly() {

		/*
    	 addSequential(new DriveTurnEncodersRight(.75, 0, 14));
    	 addSequential(new GearRelease());
    	 addSequential(new WaitCommand(3));
    	 addSequential(new DriveTurnEncodersLeft(.75, 0, 14));
    	 */
    	 
    	 /*should drive 10ft, turn 260degrees left, then backup 4ft, drive 4ft forward turn 90degrees right,
    	   then drive 10ft; should return to starting position*/
		 //addSequential(new GearHold());
		/*
    	 addSequential(new WaitCommand(1.5));
    	 addSequential(new DriveEncoders(.7, 10, 0)); //10ft forward
    	 addSequential(new DriveEncodersReverse(.75, 0, 2));
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveTurnEncodersRightExperimental(.7, 260)); //260degrees left
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveEncodersReverse(.75, 4, 0)); //4ft reverse
    	 addSequential(new DriveEncoders(.75, 0, 2));
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveEncoders(.75, 4, 0));
    	 addSequential(new DriveEncodersReverse(.75, 0, 2));
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveTurnEncodersLeftExperimental(.7, 450)); //90degees right
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveEncoders(.85, 8, 0));
    	 addSequential(new DriveEncoders(.7, 2, 0));
    	 addSequential(new DriveEncodersReverse(.75, 0, 2));
    	 */
    	 addSequential(new WaitCommand(1.5));
    	 addSequential(new DriveEncoders(.7, 10, 0)); //10ft forward
    	 addSequential(new DriveEncodersReverse(.75, 0, 2));
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveTurnEncodersRightExperimental(.7, 270)); //260degrees left
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveEncodersReverse(.75, 4, 0)); //4ft reverse
    	 addSequential(new DriveEncoders(.75, 0, 2));
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveEncoders(.75, 4, 0));
    	 addSequential(new DriveEncodersReverse(.75, 0, 2));
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveTurnEncodersLeftExperimental(.7, 450)); //90degees right
    	 addSequential(new WaitCommand(.25));
    	 addSequential(new DriveEncoders(.85, 8, 0));
    	 addSequential(new DriveEncoders(.7, 2, 0));
    	 addSequential(new DriveEncodersReverse(.75, 0, 2));
    	 //addSequential(new WaitCommand(.25));
    	 //addSequential(new GearRelease());
    }
}
