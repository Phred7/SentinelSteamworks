// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2906.SentinelSteamworks.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2906.SentinelSteamworks.Robot;

/**
 *
 */
public class LiftUp extends Command {

    public LiftUp() {
    	requires(Robot.lift);

    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.lift.LiftUp();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
