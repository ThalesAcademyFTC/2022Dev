package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="EthanTele")
//@Disabled
public class EthanTele extends OpMode {

    private Spark robot;

    @Override
    public void init() {

        //This code initializes the drivetrain. Make sure that you have the right drivetrain selected!
        robot = new Spark(this, Spark.Drivetrain.MECHANUM);
    }

    @Override
    public void loop() {
        //This nested if statement is used to make the robot move using the left joystick.
        // It works for every drive train, as long as it is set up in Anvil!


        //In the gap below would normally be where you would create if statements for buttons
        if (gamepad1.left_stick_x > 0.5) robot.moveRight(0.5);
        if (gamepad1.left_stick_x < -0.5) robot.moveLeft(0.5);
        if (gamepad1.left_stick_y > 0.5) robot.moveForward(0.5);
        if (gamepad1.left_stick_y < -0.5) robot.moveBackward(0.5);

        if (gamepad1.right_stick_x < -0.5) robot.turnLeft(0.5);
        if (gamepad1.right_stick_x > 0.5) robot.turnRight(0.5);

        //MOVEMENT
        //First, we want to make the robot rest if the gamepad is not being touched


        //If the gamepad is NOT at rest, then we want to see what we need to do.
        //If the gamepad is NOT at rest, then we want to see what we need to do.


        //This is the code used to run the movement for Tank drivetrain.
        robot.mechanumMovT(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x);
    }
}