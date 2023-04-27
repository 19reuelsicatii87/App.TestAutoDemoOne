package other.AppName;

public class OOPReview02 {

	public static void main(String[] args) {

		// Instanstiating Dog
		Dog dog = new Dog("Balti");
		
		// accessing abstract property
		System.out.println("Dog name is: " + dog.name);
		System.out.println("Dog name is: " + dog.getName());
		
		// accessing abstract method
		dog.makeSound();
		
		// accessing interface method
		dog.move();
		

	}

}
