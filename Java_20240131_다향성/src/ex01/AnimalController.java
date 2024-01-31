package ex01;

public class AnimalController {

	public static void main(String[] args) {

		/*다향성을 만족하지 않는다..makeSound()반복
		 *Bird b = new Bird();
		 *b.makeSound();
		 *Dog d = new Dog();
		 *d.makeSound();
		 *Cat c = new Cat();
		 *c.makeSound();
		 */
		
		sound(new Bird());
		sound(new Cat());
		sound(new Dog());
				
	}

	static void sound(Animal animal) {
		animal.makeSound();
	}
}
