
package com.fairportfirst.learn.subsystems;

import com.fairportfirst.learn.commands.ReadUltrasonicCommand;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class UltrasonicSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private static UltrasonicSubsystem instance;
    
    AnalogChannel ultraSonic;
    
    public UltrasonicSubsystem(){
        ultraSonic = new AnalogChannel(1);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ReadUltrasonicCommand());
    }
    public double getDisatnceInches(){
        
        double voltage = ultraSonic.getVoltage();
        
        double distance = voltage / 0.0098;
        
        return distance;
        
    }
    
    public double getDistanceFeet(){  
        double feet = getDisatnceInches()/12;
        return feet;
    }    
    public static UltrasonicSubsystem getInstance(){
        if(instance == null){
            instance = new UltrasonicSubsystem();
        }
        
        return instance;
    }
}

