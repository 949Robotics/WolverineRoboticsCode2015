package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.RobotMap;
import org.usfirst.frc.team949.robot.commands.ArmControlCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ArmSubsystem extends Subsystem {

	private Talon testWheel;
	
	public ArmSubsystem() {
		testWheel = new Talon(RobotMap.TEST_WHEEL);
	}

	public ArmSubsystem(String name) {
		super(name);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ArmControlCommand());
	}
	
	// Set speed from -1 to 1
	public void setSpeed(double speed) {
		testWheel.set(speed);
	}

}
