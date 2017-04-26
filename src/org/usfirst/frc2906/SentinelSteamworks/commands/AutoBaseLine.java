package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoBaseLine extends CommandGroup {

    public AutoBaseLine() {

    	addSequential(new GearMechIn());
    	addSequential(new GearHold());
		addSequential(new DriveEncoders(0.6, 8, 7));

    }
}
