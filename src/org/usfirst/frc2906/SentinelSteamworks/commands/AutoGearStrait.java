package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoGearStrait extends CommandGroup {

    public AutoGearStrait() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    		addParallel(new GearHold());
    		addParallel(new GearMechIn());
    		addParallel(new ResetEncoders());
    		addSequential(new DriveEncoders(0.8, 12, 0));
    		addSequential(new ResetEncoders());
    		addSequential(new GearMechOut());
    		addSequential(new GearHold());
    		addSequential(new DriveEncoders(-.3, -2, -6));
    		addParallel(new GearHold());
    		addParallel(new GearMechIn());
    		addParallel(new ResetEncoders());
    		addSequential(new WaitCommand(.15));
    		addSequential(new DriveTurnEncodersLeft(90));
    		addSequential(new ResetEncoders());
    		addSequential(new DriveEncoders(.8, 5, 9));
    		addSequential(new ResetEncoders());
    		addSequential(new DriveTurnEncodersRight(90));
    		addSequential(new ResetEncoders());
    		addSequential(new DriveEncoders(.8, 3, 6));
    		addSequential(new ResetEncoders());
    		addSequential(new DriveStop());
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
