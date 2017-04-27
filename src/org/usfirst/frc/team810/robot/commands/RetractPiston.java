package org.usfirst.frc.team810.robot.commands;

import org.usfirst.frc.team810.robot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class RetractPiston extends InstantCommand {

	@Override
	protected void initialize() {
		Pneumatics.setPiston(false);
	}
	
}
