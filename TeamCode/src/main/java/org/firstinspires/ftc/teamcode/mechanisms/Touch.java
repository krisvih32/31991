package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.TouchSensor;

@TeleOp(name="Touch")
public class Touch extends LinearOpMode {

    @Override
    public void runOpMode(){
        // Initialize touch sensor
        TouchSensor touch = hardwareMap.get(TouchSensor.class, "touch");
        waitForStart();

        while (opModeIsActive()) {
            if (touch.isPressed()) {
                telemetry.addData("PRESSzED", 1);
            } else {
                telemetry.addData("PRESSED", 0);
            }
        }
    }
}
