package org.usfirst.frc.team949.robot.subsystems;

import static org.usfirst.frc.team949.robot.RobotMap.backLeft;
import static org.usfirst.frc.team949.robot.RobotMap.backRight;
import static org.usfirst.frc.team949.robot.RobotMap.frontLeft;
import static org.usfirst.frc.team949.robot.RobotMap.frontRight;

import org.usfirst.frc.team949.robot.commands.JoystickDriveCommand;


//import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	RobotDrive drive;
	
	public DriveTrain() {
		drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
		drive.setInvertedMotor(MotorType.kFrontLeft, true);
		drive.setInvertedMotor(MotorType.kFrontRight, false);
		drive.setInvertedMotor(MotorType.kRearLeft, false);
		drive.setInvertedMotor(MotorType.kRearRight, true);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickDriveCommand());
    }
    
    public void driveForward() {
    	drive.mecanumDrive_Cartesian(0, 1, 0, 0);
    }
    
	public void mechanumDrive(Joystick joy) {
    	drive.mecanumDrive_Cartesian(joy.getZ(), joy.getY(), joy.getX(), joy.getTwist());
    }
    
    public void stop() {
    	drive.mecanumDrive_Cartesian(0, 0, 0, 0);
    }
}

