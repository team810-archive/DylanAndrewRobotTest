package org.usfirst.frc.team810.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Fire extends CommandGroup {

	public Fire() {
		addSequential(new PushPiston());
		addSequential(new Wait(.25));
		addSequential(new RetractPiston());
	}
}
