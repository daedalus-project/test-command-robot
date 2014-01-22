/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 * @author Steve
 */
public class CmdUmbrellaClose extends CommandGroup
{
    private static double ARM_DELAY = 0.2;
    
    public CmdUmbrellaClose()
    {
        super("CmdUmbrellaClose");
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.
        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        
        // These need to be rearranged as needed for how we want the Umbrella to open
        // maybe some these can happen parallel TBD        
                
        // Command Group takes care of "requiring" subsystems
        
        addSequential( new CmdUmbrellaArmClose( CommandBase.armBackLeft ));
        addSequential( new WaitCommand(ARM_DELAY));
        addSequential( new CmdUmbrellaArmClose( CommandBase.armBackRight ));
        addSequential( new WaitCommand(ARM_DELAY));      
        addSequential( new CmdUmbrellaArmClose( CommandBase.armFrontLeft ));
        addSequential( new WaitCommand(ARM_DELAY));       
        addSequential( new CmdUmbrellaArmClose( CommandBase.armFrontRight ));
    }
}
