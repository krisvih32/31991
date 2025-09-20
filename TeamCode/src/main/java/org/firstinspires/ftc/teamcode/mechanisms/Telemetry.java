package org.firstinspires.ftc.teamcode.mechanisms;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="telemetry")
public class Telemetry extends LinearOpMode {


    @Override
    public void runOpMode(){    
        //
        // Initialize telemetry
        telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());
        waitForStart();
        telemetry.addData("TELEMETRY", 1);
        telemetry.update();
        // Do not exit
        while (opModeIsActive()) {}
    }
}
