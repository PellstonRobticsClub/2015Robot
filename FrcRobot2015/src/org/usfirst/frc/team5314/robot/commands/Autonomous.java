package org.usfirst.frc.team5314.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    
    public  Autonomous(int mode) {
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	if (mode ==1 ){
    		addSequential(new AutoStrafe(1), .9);
    		addSequential(new StrafeStop(),.1);
    		addParallel(new ArmAutoSpin(1), 2);
    		addSequential(new AutoDriveCommand(.6, .6),2);
    		addParallel(new ArmAutoSpin(1), .7);
    		addSequential(new AutoDriveCommand(-.5, .5), .7);
    		addParallel(new ArmAutoSpin(1), .5);
    		addSequential(new LiftDoNothing(), .5);
    		addParallel(new ArmAutoSpin(1), 2);
    		addSequential(new AutoDriveCommand(.8, .8), 2);
    	}   
    	
    	if (mode == 2){
    		addSequential(new AutoStrafe(-1), .9);
    		addSequential(new StrafeStop(),.1);
    		addParallel(new ArmAutoSpin(1), 2);
    		addSequential(new AutoDriveCommand(.6, .6),2);
    		addParallel(new ArmAutoSpin(1), .7);
    		addSequential(new AutoDriveCommand(.5, -.5), .7);
    		addParallel(new ArmAutoSpin(1), .5);
    		addSequential(new LiftDoNothing(), .5);
    		addParallel(new ArmAutoSpin(1), 2);
    		addSequential(new AutoDriveCommand(.8, .8), 2);
    	}
    	if (mode == 3){
    		addSequential(new AutoStrafe(1), 2.5);
    		addSequential(new StrafeStop(),.1);
    		addSequential(new AutoDriveCommand(-.5, .5), .9);
    		addSequential(new LiftDoNothing(), .5);
    		addSequential(new AutoDriveCommand(.8, .8), 1);
    	}
    	if (mode == 4){
    		addSequential(new AutoDriveCommand(.8 , .8), 1);
    	}
    }
}
