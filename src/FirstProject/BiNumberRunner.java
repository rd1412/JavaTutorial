package FirstProject;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(20, 30);

		System.out.println(numbers.add());
		System.out.println(numbers.multiply());

		numbers.doubleValue();

		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}