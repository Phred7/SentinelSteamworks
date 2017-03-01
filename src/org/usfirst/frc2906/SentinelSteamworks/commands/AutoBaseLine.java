package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoBaseLine extends CommandGroup {

    public AutoBaseLine() {

    	addParallel(new GearHold());
		addParallel(new GearMechIn());
		addParallel(new ResetEncoders());
		addSequential(new DriveEncoders(0.75, 10, 9));
		addSequential(new DriveStop());
		addSequential(new ResetEncoders());

    }
}
