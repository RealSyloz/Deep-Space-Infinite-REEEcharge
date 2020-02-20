package frc.robot.commands.Climb;

import edu.wpi.first.wpilibj.command.Command;
//import frc.robot.subsystems.Climb;
import frc.robot.Robot;

public class ClimbUp extends Command {
    public ClimbUp() {
        requires(Robot.Climb);
    }

@Override
protected void initialize(){
}

@Override
protected void execute() {
    Robot.Climb.climbUp();
}

@Override
protected boolean isFinished(){
    return false;
}

@Override
protected void end() {
    Robot.Climb.stopClimb();
}

@Override
protected void interrupted() {
    end();
}

}