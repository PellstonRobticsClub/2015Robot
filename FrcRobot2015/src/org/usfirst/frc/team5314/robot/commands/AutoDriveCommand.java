package org.usfirst.frc.team5314.robot.commands;



import org.usfirst.frc.team5314.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


/**
 *
 */
public class AutoDriveCommand extends Command {
	private double x,y;

    public AutoDriveCommand(double yVar,double xVar) {
    	requires(Robot.chassis);
    	this.x=xVar;
    	this.y=yVar;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.AutoDrive(this.y,this.x);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
