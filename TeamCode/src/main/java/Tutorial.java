import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="motor1")
public class Tutorial extends OpMode {

    DcMotor motor1;
    @Override
    public void init() {
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
    }

    @Override
    public void loop() {
        motor1.setPower(1);
    }
}