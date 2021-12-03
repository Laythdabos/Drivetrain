
package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.JoystickDrive;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.Bannaanananaa;
import edu.wpi.first.wpilibj2.command.Command;


public class RobotContainer {
  private final Bannaanananaa m_exampleSubsystem = new Bannaanananaa();
  public final DriveSubsystem driveSubsystem = new DriveSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  public static final XboxController driverController = new XboxController(Constants.DRIVER_CONTROLLER_PORT);

  public RobotContainer() {

    configureButtonBindings();

    driveSubsystem.setDefaultCommand (
      new JoystickDrive(driveSubsystem));
  }

  private void configureButtonBindings() {}

  public Command getAutonomousCommand() {

    return m_autoCommand;
  }
}
