package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.subsystems.BallGuide;
import edu.wpi.first.wpilibj.templates.subsystems.Conveyor;
import edu.wpi.first.wpilibj.templates.subsystems.Shooter;
import edu.wpi.first.wpilibj.templates.subsystems.TankDriveWheel;
import edu.wpi.first.wpilibj.templates.subsystems.UmbrellaArm;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static BallGuide ballGuide = new BallGuide();
    public static Conveyor  conveyor = new Conveyor();
    public static Shooter   shooter = new Shooter();
    public static UmbrellaArm  armFrontLeft = new UmbrellaArm("Front-Left");
    public static UmbrellaArm  armFrontRight = new UmbrellaArm("Front-Right");
    public static UmbrellaArm  armBackLeft = new UmbrellaArm("Back-Left");
    public static UmbrellaArm  armBackRight = new UmbrellaArm("Back-Right");
    public static TankDriveWheel  wheelFrontLeft = new TankDriveWheel("Front-Left", RobotMap.WHEEL_CRIO_SLOT, RobotMap.WHEEL_FRONT_LEFT);
    public static TankDriveWheel  wheelFrontRight = new TankDriveWheel("Front-Right", RobotMap.WHEEL_CRIO_SLOT, RobotMap.WHEEL_FRONT_RIGHT);
    public static TankDriveWheel  wheelBackLeft = new TankDriveWheel("Back-Left", RobotMap.WHEEL_CRIO_SLOT, RobotMap.WHEEL_BACK_LEFT);
    public static TankDriveWheel  wheelBackRight = new TankDriveWheel("Back-Right", RobotMap.WHEEL_CRIO_SLOT, RobotMap.WHEEL_BACK_RIGHT);

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(shooter);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
