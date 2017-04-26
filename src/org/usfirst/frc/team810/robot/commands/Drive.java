package org.usfirst.frc.team810.robot.commands;

import org.usfirst.frc.team810.robot.Robot;
import org.usfirst.frc.team810.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	private DriveTrain d = Robot.driveTrain;
	private double driveMultiplier;
	
	public Drive(double speedMult){
		requires(Robot.driveTrain);
		driveMultiplier = speedMult;
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute(){
		double dan_left = Robot.oi.dan.getRawAxis(1);
		double dan_right = Robot.oi.dan.getRawAxis(3);
		//double dan_z = Robot.oi.dan.getZ();
		
		if (Math.abs(dan_left) < .25)
			dan_left = 0;
		if (Math.abs(dan_right) < .25)
			dan_right = 0;
		
		dan_left  *= driveMultiplier;
		dan_right *= driveMultiplier;
		
		d.danddyTankDrive(-dan_left, -dan_right);
		
	}

}
