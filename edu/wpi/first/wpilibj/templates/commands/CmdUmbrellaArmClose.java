/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.subsystems.UmbrellaArm;

/**
 *
 * @author Steve
 */
public class CmdUmbrellaArmClose extends CommandBase
{
    private UmbrellaArm umbrellaArm;
    
    public CmdUmbrellaArmClose()
    {
        // Use requires() here to declare subsystem dependencies
    }
    
    public CmdUmbrellaArmClose(UmbrellaArm arm)
    {
        super("CmdUmbrellaArmClose");
        umbrellaArm = arm;
        requires(arm);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end()
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
    
    public void setUmbrellaArm( UmbrellaArm arm)
    {
        umbrellaArm = arm;
    }
}
