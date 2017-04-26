package org.usfirst.frc.team810.robot.commands;

import org.usfirst.frc.team810.robot.Robot;
import org.usfirst.frc.team810.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	private DriveTrain d = Robot.driveTrain;
	public Drive(){
		requires(Robot.driveTrain);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute(){
		double dan_x = Robot.oi.dan.getX();
		double dan_y = Robot.oi.dan.getY();
		//double dan_z = Robot.oi.dan.getZ();
		
		if (Math.abs(dan_x) < .25)
			dan_x = 0;
		if (Math.abs(dan_y) < .25)
			dan_y = 0;
		
		d.danddyTankDrive(dan_x, dan_y);
		
	}

}
