package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import  com.revrobotics.CANSparkLowLevel.MotorType;


import frc.robot.Robot;
import frc.robot.Constants.DriverController;
import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import javax.sound.sampled.AudioFileFormat;
import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;


public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new intakeSubsystem. */
   //WPI_TalonSRX intake3 = new WPI_TalonSRX(Constants.Motors.m_intake3);
   
   private CANSparkMax intake1 = new CANSparkMax(Constants.Motors.m_intake1, CANSparkLowLevel.MotorType.kBrushless);
   private CANSparkMax intake2 = new CANSparkMax(Constants.Motors.m_intake2, CANSparkLowLevel.MotorType.kBrushless);
   private CANSparkMax intake3 = new CANSparkMax(Constants.Motors.m_intake3, CANSparkLowLevel.MotorType.kBrushless);

  public IntakeSubsystem() {

  }

  

  @Override
  public void periodic() {
    //This method will be called  onece per scheduler run
  }

  public void pushButtonX() {
    intake1.set(0.7); //CY 2/25
    intake2.set(0.7); //CY 2/25
    //intake3.set(0.5); //CY 2/25 need to add sensor to stop rotation once note reaches
  }

  public void stopMotorsX(){
    intake1.set(0);
    intake2.set(0);
    //intake3.set(0);
  }

  public void pushButtonB() {
    intake1.set(-1); //CY 2/25
    intake2.set(-1); //CY 2/25
    //intake3.set(-1); //CY 2/25 need to add delay so the shooter wheels can spin up first
  }

  public void stopMotorsB() {
    intake1.set(0); //CY 2/25
    intake2.set(0); //CY 2/25
    //intake3.set(0);
  }

  public void pushButtonRB() {
    intake3.set(0.5); //CY reduced speed
  }

  public void stopMotorsRB() {
    intake3.set(0);
  }
  
  public void pushButtonRT() { //CY added for testing
    intake3.set(-1); 
  }

  public void stopMotorsRT() { //CY added for testing
    intake3.set(0);
  }
}

