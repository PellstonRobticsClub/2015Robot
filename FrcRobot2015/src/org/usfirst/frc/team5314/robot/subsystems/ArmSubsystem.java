package org.usfirst.frc.team5314.robot.subsystems;

import org.usfirst.frc.team5314.robot.RobotMap;
import org.usfirst.frc.team5314.robot.commands.ArmSpin;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	//private static Victor leftMotor = new Victor(RobotMap.LEFT_ARM);
	//private static Victor rightMotor = new Victor(RobotMap.RIGHT_ARM);
	private RobotDrive armMotors = new RobotDrive(RobotMap.LEFT_ARM,RobotMap.RIGHT_ARM);

    public void initDefaultCommand() {
        // Set the default command for a su
    	setDefaultCommand(new ArmSpin());
    }
    
    public void spin(Joystick Stick){
    	double speedMultiplier = .8;
    	if(Stick.getRawButton(6)){
    		speedMultiplier =.5;
    	}
    	armMotors.arcadeDrive(Stick.getY()*.8, Stick.getRawAxis(4)*.8);
    	//leftMotor.set(Math.abs(Stick.getY())> .25 ? Stick.getY() : 0);
    	//rightMotor.set(-(Math.abs(Stick.getRawAxis(5))>.25 ? Stick.getRawAxis(5) : 0));
    }
    public void autoSpin(double speed, double spin){
    	armMotors.arcadeDrive(speed, spin);
    	
    }

}

