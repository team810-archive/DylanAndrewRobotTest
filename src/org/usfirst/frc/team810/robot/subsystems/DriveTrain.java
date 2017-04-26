package org.usfirst.frc.team810.robot.subsystems;

import org.usfirst.frc.team810.robot.RobotMap;
import org.usfirst.frc.team810.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	private RobotDrive drive = RobotMap.robotDrive;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Drive());
		
	}
	
	public void danddyTankDrive(double x, double y){
		drive.tankDrive(x, y);
	}

}
