// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.Constants;

public class IntakeCmd extends Command {
  /** Creates a new ArmCmd. */
  private final IntakeSubsystem m_intakeSub;
  public IntakeCmd(IntakeSubsystem subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.

    m_intakeSub = subsystem;
    addRequirements(m_intakeSub);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  
    if (RobotContainer.joystick.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_xButton)) { 
      System.out.println("PushButtonX");
      m_intakeSub.pushButtonX();
    }
    else if(RobotContainer.joystick.getRawButtonReleased(Constants.OperatorController.JoystickButtons.m_xButton)){ 
      System.out.println("StopMotorsX");
      m_intakeSub.stopMotorsX();




      
    }
    if(RobotContainer.joystick.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_bButton)){
      System.out.println("PushButtonB");
      m_intakeSub.pushButtonB();
      /*new Thread(()->{
        try{
          Thread.sleep(500);
          m_intakeSub.intake3.set(-1); //CY 2/25 need to add delay so the shooter wheels can spin up first
        }catch (Exception e){
        }}).start();*/ //CY added for testing
    }
    else if (RobotContainer.joystick.getRawButtonReleased(Constants.OperatorController.JoystickButtons.m_bButton)){
      System.out.println("StopMotorsB");
      m_intakeSub.stopMotorsB();
    }






    

    if(RobotContainer.joystick.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_rbButton)){
      System.out.println("PushBottonRB");
      m_intakeSub.pushButtonRB();
    }
    else if(RobotContainer.joystick.getRawButtonReleased(Constants.OperatorController.JoystickButtons.m_rbButton)){
      System.out.print("StopMotorsRB");
      m_intakeSub.stopMotorsRB();
    }
  
    if(RobotContainer.joystick.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_rtButton)){
      System.out.println("PushBottonRT");
      m_intakeSub.pushButtonRT();
    }
    else if(RobotContainer.joystick.getRawButtonReleased(Constants.OperatorController.JoystickButtons.m_rtButton)){
      System.out.print("StopMotorsRT");
      m_intakeSub.stopMotorsRT();
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
