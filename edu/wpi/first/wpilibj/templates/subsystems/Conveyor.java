/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.CmdConveyorStop;

/**
 *
 * @author Steve
 */
public class Conveyor extends Subsystem
{
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Talon leftTop;
    private Talon leftBottom;    
    private Talon rightTop;
    private Talon rightBottom;
    
    private Solenoid leftSolenoid;
    private Solenoid rightSolenoid;
    
    public Conveyor()
    {
        leftTop     = new Talon( RobotMap.CONVEYOR_CRIO_SLOT, RobotMap.CONVEYOR_TOP_LEFT);
        leftBottom  = new Talon( RobotMap.CONVEYOR_CRIO_SLOT, RobotMap.CONVEYOR_BTM_LEFT);    
        rightTop    = new Talon( RobotMap.CONVEYOR_CRIO_SLOT, RobotMap.CONVEYOR_TOP_RIGHT);
        rightBottom = new Talon( RobotMap.CONVEYOR_CRIO_SLOT, RobotMap.CONVEYOR_BTM_RIGHT); 
        
        leftSolenoid = new Solenoid( RobotMap.CONVEYOR_SOLENOID_SLOT, RobotMap.CONVEYOR_SOLENOID_LEFT);
        rightSolenoid = new Solenoid( RobotMap.CONVEYOR_SOLENOID_SLOT, RobotMap.CONVEYOR_SOLENOID_RIGHT);
    }

    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        setDefaultCommand(new CmdConveyorStop());
    }
    
    public void start()
    {
        //TODO
    }
    
    public void stop()
    {
         //TODO
    }
    
    public void ballIn()
    {
         //TODO       
    }
    
    public void ballOut()
    {
          //TODO      
    }
}
