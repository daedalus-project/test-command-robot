package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    public static final int WHEEL_FRONT_LEFT = 1;
    public static final int WHEEL_FRONT_RIGHT = 2;
    public static final int WHEEL_BACK_LEFT = 3;
    public static final int WHEEL_BACK_RIGHT = 4;
    
    public static final int WHEEL_CRIO_SLOT = 1;
    public static final int PNEUMATIC_CRIO_SLOT = 1;
    
    public static final int BALLGUIDE_SOLENOID_SLOT = 2;
    public static final int BALLGUIDE_FIRST_SOLENOID = 3;
    public static final int BALLGUIDE_SECOND_SOLENOID = 4;
}
