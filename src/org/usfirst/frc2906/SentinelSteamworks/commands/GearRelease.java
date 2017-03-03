package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearRelease extends Command {

    public GearRelease() {

    	requires(Robot.gearMech);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.gearMech.GearRelease();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
