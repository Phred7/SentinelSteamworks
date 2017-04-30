package org.usfirst.frc2906.SentinelSteamworks.commands;

import org.usfirst.frc2906.SentinelSteamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ScaleShoot extends Command {

    public ScaleShoot() {
    	requires(Robot.ballShooter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.ballShooter.scaleShoot();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
