package org.usfirst.frc.team5314.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int JOYSTICK_ONE = 0;
	public static final int JOYSTICK_TWO = 1;
	public static final int LIFT_MOTOR = 0;
	public static final int RIGHT_ARM =5;
	public static final int LEFT_ARM =4;
	
	
	public static final int UP_BUTTON = 4;
	public static final int DOWN_BUTTON = 1;
	public static final int LOWER_SENSOR = 4;
	public static final int UPPER_SENSOR = 5;
	// For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    public static int LEFT_MOTORS = 1;
    public static int RIGHT_MOTORS = 2;
    public static int STRAFE_MOTOR = 3;
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
