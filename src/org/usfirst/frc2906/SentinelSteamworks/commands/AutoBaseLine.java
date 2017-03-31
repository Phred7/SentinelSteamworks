package org.usfirst.frc2906.SentinelSteamworks.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoBaseLine extends CommandGroup {

    public AutoBaseLine() {


		addParallel(new DriveEncoders(0.5, 8, 6));

    }
}
