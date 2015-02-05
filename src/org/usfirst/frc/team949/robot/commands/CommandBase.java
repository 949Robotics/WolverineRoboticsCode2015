package org.usfirst.frc.team949.robot.commands;

import org.usfirst.frc.team949.robot.OI;
import org.usfirst.frc.team949.robot.Robot;
import org.usfirst.frc.team949.robot.subsystems.Camera;
import org.usfirst.frc.team949.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {

	protected static OI oi = Robot.oi;
	protected static DriveTrain mecanumDrive = Robot.driveTrain;
	protected static Camera camera = Robot.camera;
	protected static Joystick driverJoystick = oi.driverJoystick;
	protected static Joystick playerJoystick = oi.playerJoystick;

	public CommandBase() {

		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}

}
