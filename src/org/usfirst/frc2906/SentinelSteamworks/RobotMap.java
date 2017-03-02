
package org.usfirst.frc2906.SentinelSteamworks;


import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;

/**

 */
public class RobotMap {

	public static SpeedController liftMotor;
    public static SpeedController driveTrainLeft;
    public static SpeedController driveTrainRight;
    public static SpeedController ExtraController1;
    public static SpeedController ExtraController2;
    public static SpeedController ExtraController3;
    public static SpeedController ballPickupPickup;
    public static Encoder encoderRight;
    public static Encoder encoderLeft;
    public static Solenoid liftSolenoid1;
    public static RobotDrive driveTrainRobotDrive;
    public static Compressor compressor;
    public static CameraServer camera1;
    public static CameraServer camera2;
    public static DoubleSolenoid GearSinglePiston;
    public static DoubleSolenoid GearDoublePiston;
    public static final double sensitivity = 0.1;
    
    public static double tinch = 76.43;

    public static void init() {

        driveTrainLeft = new Spark(0);
        LiveWindow.addActuator("DriveTrain", "Left", (Spark) driveTrainLeft);
        
        driveTrainRight = new Spark(1);
        LiveWindow.addActuator("DriveTrain", "Right", (Spark) driveTrainRight);
        
        ExtraController2 = new Spark(2);
        
        ExtraController1 = new Spark(3);
        
        liftMotor = new Spark(4);
        LiveWindow.addActuator("LiftMotor", "Lift", (Spark) liftMotor);
        
        
        ballPickupPickup = new Spark(8);
        LiveWindow.addActuator("BallPickup", "Pickup", (Spark) ballPickupPickup);
        
        ExtraController3 = new Spark(9);

        driveTrainRobotDrive = new RobotDrive(driveTrainLeft, driveTrainRight);
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.1);
        driveTrainRobotDrive.setMaxOutput(1.0);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        
        GearDoublePiston = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("GearMech", "Double Piston", GearDoublePiston);
        
        GearSinglePiston = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("GearMech", "Single Piston", GearSinglePiston);
        
        
        encoderRight = new Encoder(0, 1, true, Encoder.EncodingType.k4X);
        encoderRight.setPIDSourceType(PIDSourceType.kDisplacement);
        encoderRight.setDistancePerPulse(1.0 / tinch);
        encoderRight.reset();
        
        encoderLeft = new Encoder(2, 3, false, Encoder.EncodingType.k4X);
        encoderLeft.setPIDSourceType(PIDSourceType.kDisplacement);
        encoderLeft.setDistancePerPulse(1.0 / tinch);
        encoderLeft.reset();
        
        CameraServer server1 = CameraServer.getInstance();
        CameraServer server2 = CameraServer.getInstance();
        server1.startAutomaticCapture();
        server2.startAutomaticCapture();
        
        compressor  = new Compressor(0);
        


    }
    public Encoder getEncoderRight(){
    	return encoderRight;
    }
    
    public Encoder geetEncoderLeft(){
    	return encoderLeft;
    }
}
