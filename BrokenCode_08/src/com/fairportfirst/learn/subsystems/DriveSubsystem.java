
package com.fairportfirst.learn.subsystems;

import com.fairportfirst.learn.RobotMap;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    static DriveSubsystem instance;
    
    CANJaguar frontLeft;
    CANJaguar frontRight;
    
    public DriveSubsystem(){
        
        frontLeft = new Jaguar(RobotMap.FRONT_LEFT_JAGUAR_ID);
        frontRight = new CANJaguar(RobotMap.FRONT_RIGHT_JAGUAR_ID);
        
    }
    
    public void drive(double left, double right){
        frontLeft.setX(left);
        try {
            frontRight.setX(right);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
        
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveCommand(null));
    }
    
    public static DriveSubsystem getInstance(){
        
        if(instance == null){
            instance = new DriveSubsystem();
        }
        
        return instance;
    }
}

