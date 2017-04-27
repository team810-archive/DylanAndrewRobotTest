package org.usfirst.frc.team810.robot.subsystems;

import org.usfirst.frc.team810.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public static void setPiston(boolean state) {
		if (state)
			RobotMap.solenoid.set(Value.kForward);
		else
			RobotMap.solenoid.set(Value.kReverse);
	}

}
