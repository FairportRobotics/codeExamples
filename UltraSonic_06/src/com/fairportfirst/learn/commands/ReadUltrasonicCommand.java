
package com.fairportfirst.learn.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author bradmiller
 */
public class ReadUltrasonicCommand extends CommandBase {

    public ReadUltrasonicCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(ultrasonicSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
        SmartDashboard.putNumber("Distance", ultrasonicSubsystem.getDisatnceInches());
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
