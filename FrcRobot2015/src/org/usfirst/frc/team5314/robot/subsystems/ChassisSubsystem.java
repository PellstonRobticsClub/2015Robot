package org.usfirst.frc.team5314.robot.subsystems;


import org.usfirst.frc.team5314.robot.RobotMap;
import org.usfirst.frc.team5314.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive; 
import edu.wpi.first.wpilibj.VictorSP;

/**
 *
 */
public class ChassisSubsystem extends Subsystem {
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private RobotDrive robot = new RobotDrive(RobotMap.LEFT_MOTORS, RobotMap.RIGHT_MOTORS);
	private VictorSP strafe = new VictorSP(RobotMap.STRAFE_MOTOR);
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveCommand());
    }
    
    public void Drive(Joystick Stick){
    	double speedmultiplier;
    	if(Stick.getRawButton(6)){
    		speedmultiplier = .5;
    	} else if (Stick.getRawButton(5)) {
			speedmultiplier =.9;
		}else {
    		speedmultiplier = .7;
    	}
    	robot.arcadeDrive((Stick.getY()*speedmultiplier) , -(Stick.getRawAxis(4)*speedmultiplier));
    	
    	strafe.set(Math.abs(Stick.getX())>.25 ? Stick.getX()*speedmultiplier : 0);
    	
    }
    
    public void AutoDrive(double y,double x){
    	robot.tankDrive(-y, -x);
    
    }
    
    public void Stop(){
    	robot.drive(0, 0);
    }
}

