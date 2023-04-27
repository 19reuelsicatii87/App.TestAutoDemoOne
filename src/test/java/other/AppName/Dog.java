package other.AppName;

public class Dog extends Animal implements Moveable {

	// Class Constructor
	public Dog(String name) {
		super(name);
		System.out.println("This is from Class Contructor");
	}

	public void makeSound() {
		System.out.println("accessing Abstract Method from Super/Abstract Class");
	}

	public void move() {
		System.out.println("accessing Interface Method from Interface");
	}

}
