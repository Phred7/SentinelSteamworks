package org.usfirst.frc2906.SentinelSteamworks.commands;

import java.awt.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoGearStrait extends CommandGroup {

    public AutoGearStrait() {

    		
    		//addSequential(new GearMechIn());
    		//addSequential(new DriveEncoders(1.0, 12, 0));
    		//addParallel(new GearMechOut());
    		addSequential(new GearHold());
    		addSequential(new DriveEncoders(.8, 7, 9));
    		addSequential(new GearRelease());
    		addSequential(new DriveEncodersReverse(-.5, 1, 6));
    		addSequential(new GearHold());
    		//addSequential(new GearMechOut());
    		
    		/*
    		addSequential(new DriveEncoders(-.15, -2, -6));
    		addParallel(new GearHold());
    		addParallel(new GearMechIn());
    		addSequential(new DriveTurnEncodersLeft(.5, 90));
    		addSequential(new DriveEncoders(.5, 5, 9));
    		addSequential(new DriveTurnEncodersRight(.4, 90));
    		addSequential(new DriveEncoders(.5, 3, 6));
    		addSequential(new DriveStop());
    		*/
    }
}
