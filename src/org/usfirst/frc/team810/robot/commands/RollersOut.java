package org.usfirst.frc.team810.robot.commands;

import org.usfirst.frc.team810.robot.Robot;
import org.usfirst.frc.team810.robot.RobotMap;
import org.usfirst.frc.team810.robot.subsystems.Rollers;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.TimedCommand;

public class RollersOut extends TimedCommand {
	
	CANTalon rollers;
	double speed;

	public RollersOut(double timeout, double speed) {
		super(timeout);
		requires(Robot.rollers);
		rollers = RobotMap.rollers;
		this.speed = speed;
	}

	@Override
	protected void execute() {
		Rollers.setRollerSpeed(speed);
	}

	@Override
	protected void end() {
		rollers.set(0);
		rollers.disable();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
