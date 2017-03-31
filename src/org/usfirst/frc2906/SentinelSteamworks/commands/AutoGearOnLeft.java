package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoGearOnLeft extends CommandGroup {

    public AutoGearOnLeft() {
    	
    	//addSequential(new DriveTurnEncodersLeft(0.5, 0, 7));
    /*
    	addSequential(new GearHold());
		addSequential(new DriveEncoders(.7, 7, 9));
		addSequential(new WaitCommand(.5));
		addSequential(new GearRelease());
		addSequential(new WaitCommand(.25));
		addSequential(new DriveEncodersReverse(-.6, 1, 6));
		addSequential(new WaitCommand(1.5));
		addSequential(new GearHold());
		addSequential(new GearMechIn());
		addSequential(new GearMechOut());
    	*/
    	addSequential(new DriveTurnEncodersLeftExperimental(.7, 360));
    	/*
    	addSequential(new GearHold());
    	addSequential(new GearMechIn());
    	addSequential(new GearRelease());
    	addSequential(new GearMechOut());
    	addSequential(new GearHold());
    	addSequential(new GearMechIn());
    	addSequential(new GearRelease());
    	addSequential(new GearMechOut());
    	*/
    	/*
    	addParallel(new GearHold());
		addParallel(new GearMechIn());
		addSequential(new DriveEncoders(0.8, 12, 0));
		addSequential(new DriveTurnEncodersRight(.4, 45));
		addSequential(new DriveEncoders(.8, 1, 6));
		addSequential(new GearMechOut());
		addSequential(new GearHold());
		addSequential(new DriveEncoders(-.3, -1, -6));
		addParallel(new GearHold());
		addParallel(new GearMechIn());
		addSequential(new DriveTurnEncodersLeft(.4, 45));
		addSequential(new DriveEncoders(.8, 2, 6));
		addSequential(new DriveStop());
*/
    }
}
