package Constructors;

public class MotorBike {

	private int speed; // member variable

	MotorBike(int speed) { // Parameterized constructor
		this.speed = speed;
		System.out.println("Constructor Called");
		System.out.println(speed);
	}

	MotorBike() { // No Argument constructor
		this(79); // calling Parameterized constructor
		System.out.println("TVS Bike Constructor");
	}

}