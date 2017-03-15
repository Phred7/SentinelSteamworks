package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearMechIn extends Command {

    public GearMechIn() {

    	requires(Robot.gearMech);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.gearMech.GearMechIn();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
