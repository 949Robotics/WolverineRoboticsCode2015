
package org.usfirst.frc.team949.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team949.robot.Robot;

/**
 * Placeholder until Autonomous Commands have been written. This will be replaced by a
 * command group.
 */
public class AutonomousCommand extends Command {

    public AutonomousCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.driveForward();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
