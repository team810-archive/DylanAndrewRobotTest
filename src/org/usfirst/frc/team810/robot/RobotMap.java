package org.usfirst.frc.team810.robot;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static RobotDrive robotDrive;
	public static Spark leftSpark;
	public static Spark rightSpark;
	
	public static DoubleSolenoid solenoid;
	public static Compressor compressor;
	
	public static CANTalon rollers;
	
	public static void init(){
		leftSpark = new Spark(PortNumber.LEFT_MOTOR_CHANNEL);
		rightSpark = new Spark(PortNumber.RIGHT_MOTOR_CHANNEL);
		robotDrive = new RobotDrive(leftSpark, rightSpark);
		
		LiveWindow.addActuator("Drive", "Right Motor", rightSpark);
		LiveWindow.addActuator("Drive", "Left Motor", leftSpark);
		
		solenoid = new DoubleSolenoid(PortNumber.PCM_MODULE_NUMBER, PortNumber.SOLENOID_FORWARD_CHANNEL, PortNumber.SOLENOID_REVERSE_CHANNEL);
		LiveWindow.addActuator("Pneumatics", "Solenoid", solenoid);
		
		compressor = new Compressor(PortNumber.PCM_MODULE_NUMBER);
		
		rollers = new CANTalon(PortNumber.ROLLER);
		rollers.changeControlMode(TalonControlMode.Speed);
	}
}
