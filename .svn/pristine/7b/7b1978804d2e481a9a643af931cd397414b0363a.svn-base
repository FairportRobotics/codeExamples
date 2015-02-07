/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairportfirst.templates.subsystems;

import com.fairportfirst.templates.RobotMap;
import com.fairportfirst.templates.commands.CathodeOffCommand;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Brian
 *
 */
public class CathodeSubsystem extends Subsystem{

    private static CathodeSubsystem instance;
    private Relay relay;
    
    public CathodeSubsystem() {
        relay = new Relay(RobotMap.CATHODE_RELAY_CHANNEL);
    }
    
    protected void initDefaultCommand() {
        setDefaultCommand(new CathodeOffCommand());
    }
    
    public static CathodeSubsystem getInstance(){
        if (instance == null)
        {
            instance = new CathodeSubsystem();
        }
        return instance;
    }
    
    public void turnOn() {
        relay.set(Relay.Value.kForward);
        System.out.println("Cathode ON!");//Turn the cathode on
        // cathodeRelay.set(Relay.Value.kOn); Not too sure why this doesnt work.
            //might have something to do with the directions
        
        //cathodeRelay.setDirection(Relay.Direction.kForward);
    }
    
    public void turnOff() {
        relay.set(Relay.Value.kOff);
        System.out.println("Cathode OFF!");
        //Turn the cathode off
        //cathodeRelay.setDirection(Relay.Direction.kReverse);
    }
    
}
