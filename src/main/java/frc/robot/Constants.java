// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  /**public class Motors{
    public  class DriveMotors{
        public static final int m_frontLeft = 3;
        public static final int m_rearLeft = 4;
        public static final int m_frontRight = 1;
        public static final int m_rearRight = 2;
    }
    
  }*/

  public final class Motors{

    public static final int m_frontLeft = 4;
    public static final int m_rearLeft = 2;
    public static final int m_frontRight = 3;
    public static final int m_rearRight = 1;
    
    public static final int m_arm1 = 5;
    public static final int m_arm2 = 6;

    public static final int m_intake1 = 14;
    public static final int m_intake2 = 15;
    public static final int m_intake3 = 16;


  }


  public final class DriverController{

    public static final int kDriverControllerPort = 0;
    public static final int m_driverController = 0;
    
       
      public final class Joystick{

       public static final int m_leftStickX = 0;
       public static final int m_leftStickY = 1;
       
    }
    
   }

   public final class OperatorController{

    public static final int m_operatorController = 1; 


      public final class JoystickButtons {
        public static final int m_xButton = 1;
        public static final int m_bButton = 3;
        public static final int m_rbButton = 6;
        public static final int m_rtButton = 8; //CY added for testing

      }

      public final class JoystickAxis{
        public static final int m_leftStickX = 0;
        public static final int m_leftStickY = 1;
      }

   }


  }

