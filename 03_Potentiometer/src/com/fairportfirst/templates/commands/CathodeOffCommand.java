/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairportfirst.templates.commands;

import com.fairportfirst.templates.subsystems.CathodeSubsystem;

/**
 *
 * @author Brian
 */
public class CathodeOffCommand extends CommandBase{

    public CathodeOffCommand(){
        requires(cathodeSubsystem);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        cathodeSubsystem.turnOff();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
