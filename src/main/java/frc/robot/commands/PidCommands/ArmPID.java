// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.PidCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;
import com.revrobotics.CANSparkMax;





public class ArmPID extends Command{

    boolean isFinishedStep = false;

    public ArmPID() {
      // Use addRequirements() here to declare subsystem dependencies.
      //addRequirements(Robot.m_elbow);
      //addRequirements(Robot.m_wrist);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
  
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {

      /* lc need to fix
      if (Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_yButton))
      {  
        if(!isFinishedStep) {
          double elbowPValue = Constants.HighPIDCoefficients.m_HighElbowP;
          double elbowIValue = Constants.HighPIDCoefficients.m_HighElbowI;
          double elbowDValue = Constants.HighPIDCoefficients.m_HighElbowD;
          Robot.m_elbow.setPIDValues(elbowPValue, elbowIValue, elbowDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
          double elbowRotations = Constants.HighPIDCoefficients.m_HighElbowRotations;
          Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
         // if(Robot.m_elbow.isAtSetpoint()) 
          isFinishedStep =true;
        }
      }
       */

    }
        
        
  
    
}
