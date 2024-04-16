package MotorBike;

public class MotorBike {

	private int speed; // member variable

	void start() {
		System.out.println("Broom Broom!!");
	}

	public void setSpeed(int speed) { // local variable
		if (speed > 0) {
			this.speed = speed;
		}

		// System.out.println(speed);
		// System.out.println(this.speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}