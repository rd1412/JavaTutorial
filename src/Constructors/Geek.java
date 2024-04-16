package Constructors;

public class Geek {

	String Name;
	int Age;

	Geek() {
		this("John", 30); // calling another constructor
		System.out.println("No-Argument Constructor Called");
	}

	Geek(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
		System.out.println("Parameterized Constructor Called");
	}
}
