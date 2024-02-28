package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;

import frc.robot.Robot;
import frc.robot.Constants.DriverController;
import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import javax.sound.sampled.AudioFileFormat;
import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;


public class ArmSubsystem extends SubsystemBase {
  /** Creates a new ArmSubsystem. */
   WPI_TalonSRX arm1 = new WPI_TalonSRX(Constants.Motors.m_arm1);
   WPI_TalonSRX arm2 = new WPI_TalonSRX(Constants.Motors.m_arm2);


  public ArmSubsystem() {

   // arm1.setInverted(false);
   // arm2.setInverted(false);

  }


  @Override
  public void periodic() {
    //This method will be called onece per scheduler run
  }

  public void pushButtonForward() {
    arm1.set(1); //CY 2/25
    arm2.set(1); //CY 2/25
  }

  public void pushButtonBackward() {
    arm1.set(-0.5); //CY 2/25
    arm2.set(-0.5); //CY 2/25
  }

  public void stopMotors(){
    arm1.set(0);
    arm2.set(0); 
  }



}