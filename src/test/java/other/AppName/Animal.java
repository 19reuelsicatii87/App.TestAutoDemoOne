package other.AppName;

abstract class Animal {

	// Abstract Property
	public String name;

	// Abstract Constructor
	protected Animal(String name) {
		System.out.println("This is from Abstract Contructor");
		this.name = name;
	}

	// Getter Method
	public String getName() {
		return this.name;
	}

	// Abstract Method
	public abstract void makeSound();
}
