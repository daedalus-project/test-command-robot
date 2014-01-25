/*
 * Team Daedalus FRC 2889
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.CmdBallGuideRaise;

/**
 *
 * @author Steve
 */

/*
    Need to add add Solenoids - these are 3 positiion cylinders, 
    but are in effect 2 separate solenoid controllers
*/

public class BallGuide extends Subsystem
{
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Solenoid firstSolenoid;
    private Solenoid secondSolenoid;
    
    public BallGuide()
    {
        firstSolenoid = new Solenoid(RobotMap.BALLGUIDE_SOLENOID_SLOT, RobotMap.BALLGUIDE_FIRST_SOLENOID);
        secondSolenoid = new Solenoid(RobotMap.BALLGUIDE_SOLENOID_SLOT, RobotMap.BALLGUIDE_SECOND_SOLENOID);
    }

    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        setDefaultCommand(new CmdBallGuideRaise());
    }
    
    // These are guesses as to which shoulkd be true or fals for each position
    public void setPositionLowered()
    {
        firstSolenoid.set(true);
        secondSolenoid.set(true);
    }
    
    public void setPositionShoot()
    {
        firstSolenoid.set(true);
        secondSolenoid.set(false);  
    }
    
    public void setPositionRaised()
    {
        firstSolenoid.set(false);
        secondSolenoid.set(false);
    }
}
