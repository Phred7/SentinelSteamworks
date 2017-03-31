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
		addSequential(new DriveEncoders(.7, 7, 9));
		addSequential(new WaitCommand(.5));
		addSequential(new GearRelease());
		addSequential(new WaitCommand(.25));
		addSequential(new DriveEncodersReverse(-.6, 1, 6));
		addSequential(new WaitCommand(1.5));
		addSequential(new GearHold());
		addSequential(new GearMechIn());
		addSequential(new GearMechOut());
    		
    		//speeds may need to be adjusted since left speed is greater than right speed

    }
}
