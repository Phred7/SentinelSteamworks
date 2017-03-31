package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoGearOnRight extends CommandGroup {

    public AutoGearOnRight() {
        
    	addParallel(new GearHold());
		addParallel(new GearMechIn());
		addSequential(new DriveEncoders(0.8, 12, 0));
		addSequential(new DriveTurnEncodersLeft(.5, 0, 7));
		addSequential(new DriveEncoders(.8, 1, 6));
		addSequential(new GearMechOut());
		addSequential(new GearHold());
		addSequential(new DriveEncodersReverse(.5, 1, 6));
		addParallel(new GearHold());
		addParallel(new GearMechIn());
		//addSequential(new WaitCommand(.15));
		addSequential(new DriveTurnEncodersRight(.5, 0, 7));
		addSequential(new DriveEncoders(.8, 2, 6));
		addSequential(new DriveStop());
        
    }
}
