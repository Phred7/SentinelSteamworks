package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoTestDriveOnly extends CommandGroup {

    public AutoTestDriveOnly() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	
    	// addSequential(new DriveEncoders(.4, 2, 6));
    	 //addSequential(new GearRelease());
    	 addSequential(new DriveTurnEncodersRight(.3, 90));
    	 addSequential(new DriveTurnEncodersLeft(.3, 45));
    	/*
    	addSequential(new LiftUp());
    	addSequential(new WaitCommand(.2));
    	addParallel(new LiftStop());
    	addSequential(new GearRelease());
    	*/
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
