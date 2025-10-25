package level2.exercise1L2.main;

import level2.exercise1L2.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();
		Dog dog1 = new Dog("Tobby", "Guau!", 6);

		Dog dog2 = new Dog("Rambo", "Goof!", 2);

		dogs.add(dog1);
		dogs.add(dog2);

		Dog.saveJson(dogs);

	}
}

