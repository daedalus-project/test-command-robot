/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.CmdWheelAtSpeed;

/**
 *
 * @author Steve
 */
public class TankDriveWheel extends Subsystem
{
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private String wheelName;
    
    private Talon controller;
    
    public TankDriveWheel(String which, int slot, int channel)
    {
        this.wheelName = which;
        controller = new Talon(slot, channel);
    }
            

    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        setDefaultCommand(new CmdWheelAtSpeed(this, 0d));
    }
    
    public void setSpeed( double speed)
    {
        controller.set(speed);
    }
}
