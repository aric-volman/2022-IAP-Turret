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
    public static final class DriveTrainPorts {
        public static final int LeftDriveTalonPort = 1; 
        public static final int RightDriveTalonPort = 2;
        // For testing with the 2021 Competition Robot
        public static final int LeftDriveVictorPort = 4;
        public static final int RightDriveVictorPort = 5;
    }
    /*
    Usually, MotorPorts is used, shown from previous years
    This is because there are other motors, rather than
    the drivetrain.
    */
    public static final class MotorPorts { 
        public static final int TurretPort = 4; 
    }

    public static final class DriveTrainConstants {
        public static final double wheelDiameterInInches = 6.0;
        public static final double ticksToMeters = (1.0/(wheelDiameterInInches*0.0254*Math.PI))*4096.0;
    }

    public static final class USBOrder {
        public static final int Zero = 0;
        public static final int One = 1;
    }
}
