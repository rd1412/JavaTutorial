package MotorBike;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(120);
		honda.setSpeed(100);

		ducati.increaseSpeed(50);
		honda.increaseSpeed(50);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.decreaseSpeed(100);
		honda.decreaseSpeed(100);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}
}
