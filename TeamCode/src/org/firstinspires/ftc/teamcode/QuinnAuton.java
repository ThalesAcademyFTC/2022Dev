package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Spark.Drivetrain.MECHANUM;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name="QuinnAuton")
//@Disabled

public class QuinnAuton extends LinearOpMode {
    private Spark robot;
    private ElapsedTime runtime = new ElapsedTime();
    @Override
    public void runOpMode() {
        robot = new Spark(this, MECHANUM);
        telemetry.addData("Status", "Initialized");
        runtime.reset();
        telemetry.update();
        //Code Above the waitForStart() is where you define variables or initialize any Vuforia
        //DO NOT PUT MOVEMENT CODE HERE - YOU WILL BE PENALIZED


        waitForStart(); //Below this point is where you place the linear code for your autonomous.
        //Any code that goes in this space is only run once, and after it is finished the program ends.
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(4334,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(4334,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(4334,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(1300,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(1300,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(1300,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(1300,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(866,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(866,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(866,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(866,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(866,0.5);
        sleep(100);
        robot.moveForwardFT(600,0.5);
        sleep(100);
        robot.turnLeftFT(866,0.5);
       // Example
        // robot.moveForwardFT(1000, 0.5);


        //Inside of the while statement below is any code that you want to run in loop during autonomous.
        while (opModeIsActive() && runtime.milliseconds() < 30000) {


        }


    }
}
