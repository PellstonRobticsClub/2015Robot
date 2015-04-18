package org.usfirst.frc.team5314.robot.subsystems;

import org.usfirst.frc.team5314.robot.RobotMap;
import org.usfirst.frc.team5314.robot.commands.LiftDoNothing;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LiftSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Talon liftMotor = new Talon(RobotMap.LIFT_MOTOR);
	public DigitalInput lowerSensor = new DigitalInput(RobotMap.LOWER_SENSOR);
	public DigitalInput upperSensor = new DigitalInput(RobotMap.UPPER_SENSOR);
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new LiftDoNothing());
    }
    public void DoNothing(){
    	liftMotor.set(0);
    }
    public void MoveUp(){
    	liftMotor.set(1);
    }
    
    public void MoveDown(){
    	liftMotor.set(-1);
    }
    
    public void UpdateDashboard(){
    	SmartDashboard.putBoolean("UP Sensor", upperSensor.get());
    	SmartDashboard.putBoolean("down Sensor", lowerSensor.get());
    }
    public boolean isLiftDown(){
    	return !lowerSensor.get();
    }
}

