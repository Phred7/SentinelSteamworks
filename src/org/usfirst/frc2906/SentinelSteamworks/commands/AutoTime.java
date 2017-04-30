package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoTime extends CommandGroup {

    public AutoTime() {	
    	addSequential(new DriveTank(0.5));
    }
}
