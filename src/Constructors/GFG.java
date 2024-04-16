package Constructors;

public class GFG {

	public static void main(String[] args) {
		Geek geek1 = new Geek();
		System.out.println("Hello World!!");

		Geek geek2 = new Geek("Alexa", 25);
		System.out.println("Name :" + geek2.Name + " and Age :" + geek2.Age);
	}
}