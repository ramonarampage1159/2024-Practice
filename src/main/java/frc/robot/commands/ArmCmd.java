// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.ArmSubsystem;

public class ArmCmd extends Command {
  /** Creates a new ArmCmd. */
  private final ArmSubsystem m_armSub;
  public ArmCmd(ArmSubsystem subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.

    m_armSub = subsystem;
    addRequirements(m_armSub);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  
    if (RobotContainer.joystick.getRawButtonPressed(4)) {
      System.out.println("PushButtonForward");
      m_armSub.pushButtonForward();
    }
    else if(RobotContainer.joystick.getRawButtonReleased(4)){
      System.out.println("StopMotors Forward");
       m_armSub.stopMotors();
    }
    if(RobotContainer.joystick.getRawButtonPressed(2)){
      System.out.println("PushButtonBack");
      m_armSub.pushButtonBackward();
    }
    else if (RobotContainer.joystick.getRawButtonReleased(2)){
         System.out.println("StopMotors Back");
         m_armSub.stopMotors();
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
