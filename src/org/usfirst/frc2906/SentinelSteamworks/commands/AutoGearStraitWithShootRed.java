package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoGearStraitWithShootRed extends CommandGroup {

    public AutoGearStraitWithShootRed() {

		addSequential(new GearHold());
		addSequential(new DriveEncoders(.8, 7, 9));
		addSequential(new WaitCommand(.25));
		addSequential(new GearRelease());
		addSequential(new WaitCommand(.25));
		addSequential(new DriveEncodersReverse(-.6, 3, 6));
		addSequential(new WaitCommand(.25));
		addSequential(new GearHold());
		addSequential(new DriveTurnEncodersRight(.4, 0, 14));
		addSequential(new DriveEncoders(.8, 10, 0));
		addSequential(new Shoot());
		addSequential(new WaitCommand(5));
		
    }
}
