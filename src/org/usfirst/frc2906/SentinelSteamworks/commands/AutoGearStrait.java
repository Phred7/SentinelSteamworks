package org.usfirst.frc2906.SentinelSteamworks.commands;

import java.awt.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoGearStrait extends CommandGroup {

    public AutoGearStrait() {
    	
    	addSequential(new GearHold());
		addSequential(new DriveEncoders(.8, 6, 0));
		addSequential(new DriveEncoders(.65, 1, 9));
		addSequential(new WaitCommand(.5));
		addSequential(new GearRelease());
		addSequential(new WaitCommand(.25));
		addSequential(new DriveEncodersReverse(.65, 1, 6));
		addSequential(new WaitCommand(1.5));
		addParallel(new GearHold());
		addParallel(new GearMechIn());
		addSequential(new WaitCommand(.5));
		addParallel(new GearMechOut());
		addParallel(new GearRelease());
    		
    		//speeds may need to be adjusted since left speed is greater than right speed

    }
}
