package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearMechOut extends Command {

    public GearMechOut() {

    	requires(Robot.gearMech);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.gearMech.pistonsOut();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
