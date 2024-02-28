// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.robot.Robot;
import frc.robot.Constants.DriverController;
import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import javax.sound.sampled.AudioFileFormat;
import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;


public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new DrivetrainSubsystem. */
   WPI_TalonSRX frontLeft = new WPI_TalonSRX(Constants.Motors.m_frontLeft);
   WPI_TalonSRX rearLeft = new WPI_TalonSRX(Constants.Motors.m_rearLeft);
   WPI_TalonSRX frontRight = new WPI_TalonSRX(Constants.Motors.m_frontRight);
   WPI_TalonSRX rearRight = new WPI_TalonSRX(Constants.Motors.m_rearRight) ;

  private DifferentialDrive diffdrive;

 /* DifferentialDrive drive = new DifferentialDrive(
    (double output) -> {
        rearLeft.follow(frontLeft);
    },
    (double output) -> {
        rearRight.follow(frontRight);
    });
*/

  public DrivetrainSubsystem() {

    rearLeft.follow(frontLeft);
    rearRight.follow(frontRight);
    
    frontRight.setInverted(false);
    rearRight.setInverted(false);
    frontLeft.setInverted(true);
    rearLeft.setInverted(true);

    diffdrive = new DifferentialDrive(frontLeft,frontRight); 
  }


  @Override
  public void periodic() {
    //This method will be called onece per scheduler run
  }

  public void drive(double left,double right) {
    frontLeft.set(left);
    //rearLeft.set(left);
    frontRight.set(right);
    //rearRight.set(right);
    diffdrive.tankDrive(left,right);
  }

}