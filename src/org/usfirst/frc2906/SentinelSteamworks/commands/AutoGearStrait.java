package org.usfirst.frc2906.SentinelSteamworks.commands;

import java.awt.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoGearStrait extends CommandGroup {

    public AutoGearStrait() {
    	
    	addSequential(new GearMechIn());
		addSequential(new DriveEncoders(.75, 6, 6));
		addSequential(new DriveEncoders(.5, 2, 7));
		addSequential(new DriveEncodersReverse(.5, 0, 1));
		addSequential(new WaitCommand(.5));
		addSequential(new GearMechOut());
		addSequential(new WaitCommand(.25));
		addSequential(new DriveEncodersReverse(.65, 1, 2));
		addSequential(new WaitCommand(.5));
		addSequential(new GearMechIn());
		addSequential(new WaitCommand(.25));
		addSequential(new DriveTurnEncodersLeftExperimental(.7, 90));
    		
    		//speeds may need to be adjusted since left speed is greater than right speed

    }
}
