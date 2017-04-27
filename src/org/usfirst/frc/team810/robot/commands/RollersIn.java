package org.usfirst.frc.team810.robot.commands;

import org.usfirst.frc.team810.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RollersIn extends Command {

	public RollersIn() {
		requires(Robot.rollers);
	}
	
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
