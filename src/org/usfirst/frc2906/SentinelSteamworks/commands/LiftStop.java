package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftStop extends Command {

    public LiftStop() {

    	requires(Robot.lift);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.lift.LiftStop();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
