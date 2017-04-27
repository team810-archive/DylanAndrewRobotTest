package org.usfirst.frc.team810.robot.commands;

import org.usfirst.frc.team810.robot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class PushPiston extends InstantCommand {
	
	protected void initialize() {
		Pneumatics.setPiston(true);
	}
}
