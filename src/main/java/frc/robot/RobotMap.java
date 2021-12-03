package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class RobotMap {

    public static final int FRONT_LEFT_DRIVE_PORT = 1;
    public static final int BACK_LEFT_DRIVE_PORT = 3;
    public static final int FRONT_RIGHT_DRIVE_PORT = 2;
    public static final int BACK_RIGHT_DRIVE_PORT = 4;

    public static WPI_TalonFX frontLeftDriveMotor = new WPI_TalonFX(FRONT_LEFT_DRIVE_PORT);
    public static WPI_TalonFX frontRightDriveMotor = new WPI_TalonFX(FRONT_RIGHT_DRIVE_PORT);
    public static WPI_TalonFX backLeftDriveMotor = new WPI_TalonFX(BACK_LEFT_DRIVE_PORT);
    public static WPI_TalonFX backRightDriveMotor = new WPI_TalonFX(BACK_RIGHT_DRIVE_PORT);
}

