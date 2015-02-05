package org.usfirst.frc.team949.robot.commands;

import org.usfirst.frc.team949.robot.Robot;
import org.usfirst.frc.team949.robot.subsystems.ArmSubsystem;

import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.command.Command;

public class ArmControlCommand extends Command {

	private double speed = 0.2;
	private double speedStep = 0.2;
	private double maxSpeed = 1;
	private double joystickThreshhold = 0.5;

	public ArmControlCommand() {
		requires(Robot.armSubsystem);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		if (Robot.oi.playerJoystick.getRawButton(5)) {
			speed = 1;
		} else if (Robot.oi.playerJoystick.getRawButton(3)) {
			speed = 0.6;
		} else if (Robot.oi.playerJoystick.getRawButton(6)) {
			speed = 0.4;
		} else if (Robot.oi.playerJoystick.getRawButton(4)) {
			speed = 0.2;
		}

		if (Robot.oi.playerJoystick.getY() >= joystickThreshhold) {
			Robot.armSubsystem.setSpeed(-speed);
		} else if (Robot.oi.playerJoystick.getY() <= -joystickThreshhold) {
			Robot.armSubsystem.setSpeed(speed);
		} else {
			Robot.armSubsystem.setSpeed(0);
		}
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
