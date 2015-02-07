/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairportfirst.learn.subsystems;

import com.fairportfirst.learn.RobotMap;
import com.fairportfirst.learn.commands.DriveCommand;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author team578
 */
public class DriveSubsystem extends Subsystem{
    
    private Jaguar jagz;
    
    private static DriveSubsystem instance;
    
    public DriveSubsystem(){
        try{
            jagz = new Jaguar(RobotMap.DRIVE_JAGUAR_CHANNEL);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void drive(double speed){
        try {
            jagz.set(speed);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        
    protected void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }
    
    public static DriveSubsystem getInstance(){
        if(instance == null){
            instance = new DriveSubsystem();
        }
        
        return instance;
    }
    
}
