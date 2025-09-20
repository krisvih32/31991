package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.MecanumDrive;

@TeleOp(name = "MecanumRobotOrientatedOpMode")
public class MecanumRobotOrientatedOpMode extends OpMode {
    double forward, strafe, rotate, l2, r2;
    MecanumDrive drive = new MecanumDrive();
    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        forward = gamepad1.right_stick_x;
        strafe = gamepad1.right_stick_y;
        rotate = gamepad1.left_stick_x;
        l2 = gamepad1.left_trigger;
        r2 = gamepad1.right_trigger;

        drive.driveRelativeRobot(forward, strafe, rotate, l2, r2);

    }
}
