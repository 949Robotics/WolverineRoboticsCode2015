package org.usfirst.frc.team949.robot.commands;

import org.usfirst.frc.team949.robot.Robot;
import org.usfirst.frc.team949.robot.subsystems.ArmSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class ArmControlCommand extends Command {

	private double speed = 0.3;

	public ArmControlCommand() {
		requires(Robot.armSubsystem);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		if (Robot.oi.joystickDriver.getRawButton(5)) { // Strongest
			speed = 0.8;
		} else if (Robot.oi.joystickDriver.getRawButton(3)) { // Ok
			speed = 0.6;
		} else if (Robot.oi.joystickDriver.getRawButton(4)) { // Meh
			speed = 0.4;
		} else if (Robot.oi.joystickDriver.getRawButton(2)) { // Uhhh
			speed = 0.2;
		}
		Robot.armSubsystem.setSpeed(speed);

	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
