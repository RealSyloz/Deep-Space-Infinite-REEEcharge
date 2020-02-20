package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

//Used to actually climb in the middle

public class Climb extends Subsystem {

    public final double CLIMB_UP_SPEED  = 0.50;
    public final double CLIMB_DOWN_SPEED = -0.50;
    public final double STOP_CLIMB = 0.00;

    public WPI_VictorSPX climbMotor = new WPI_VictorSPX(RobotMap.climbMotor);


    public Climb()  {

        climbMotor.setNeutralMode(NeutralMode.Brake);
        climbMotor.setInverted(true);

    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(null);
    }

    public void climbUp() {
        climbMotor.set(ControlMode.PercentOutput, CLIMB_UP_SPEED);
    }

    public void climbDown() {
        climbMotor.set(ControlMode.PercentOutput, CLIMB_DOWN_SPEED);
    }

    public void stopClimb() {
        climbMotor.set(ControlMode.PercentOutput, STOP_CLIMB);
    }
}