package org.firstinspires.ftc.teamcode.mechanisms;

import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

@TeleOp(name="Color")
public class Color extends LinearOpMode {

    @Override
    public void runOpMode(){
        // Initialize touch sensor
        ColorSensor color = hardwareMap.get(ColorSensor.class, "color1");
        DcMotor motor = hardwareMap.get(DcMotor.class, "backLeftMotor");
        waitForStart();

        while (opModeIsActive()) {
            int red = color.red();
            int blue = color.blue();
            int green = color.green();
            int max = Math.max(Math.max(red, blue), green);
            if (max == red) {
                motor.setPower(0);
            }
            if (max == blue){
                motor.setPower(0.5);
            }
            if (max == green){
                motor.setPower(1);
            }
        }
    }
}
