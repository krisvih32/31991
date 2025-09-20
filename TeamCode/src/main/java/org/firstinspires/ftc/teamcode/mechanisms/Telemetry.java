package org.firstinspires.ftc.teamcode.mechanisms;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;

@TeleOp(name="telemetry5")
public class Telemetry extends LinearOpMode {

    DcMotor motor1;
    DigitalChannel touch1;
    @Override
    public void runOpMode(){
        // Initialize telemetry
        telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());

        try {
            motor1 = hardwareMap.get(DcMotor.class, "motor1");
        } catch (Exception e) {
            telemetry.addData("Error", "motor failed");
            telemetry.update();
            motor1 = null;
            while (true){}
        }
        try {
            touch1 = hardwareMap.get(DigitalChannel.class, "digitalTouch");
        } catch (Exception e) {
            telemetry.addData("Error", "touch failed");
            telemetry.update();
        }
        waitForStart();
        telemetry.addData("TELEMETRY", 1);
        telemetry.update();
        // Do not exit
        while (opModeIsActive()) {
            if (touch1.getState()) {
                motor1.setPower(1);
            } else {
                motor1.setPower(0);
            }
        }
    }
}
