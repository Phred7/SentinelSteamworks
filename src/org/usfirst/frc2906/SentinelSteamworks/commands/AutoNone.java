package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoNone extends CommandGroup {

    public AutoNone() {

    	addParallel(new GearRelease());
		addSequential(new DriveStop());

    }
}
