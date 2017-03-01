package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoNone extends CommandGroup {

    public AutoNone() {

    	addParallel(new GearHold());
		addParallel(new GearMechIn());
		addSequential(new DriveStop());

    }
}
