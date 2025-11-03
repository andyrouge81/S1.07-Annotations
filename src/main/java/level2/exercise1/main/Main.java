package level2.exercise1.main;

import level2.exercise1.management.JsonManagement;
import level2.exercise1.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static void main(String[] args) {

		List<Dog> dogs = new ArrayList<>();


		dogs.add(new Dog("Toby", "Guau!", 6));
		dogs.add(new Dog("Rambo", "Goof!", 2));
		dogs.add(new Dog("Socrates", "Arff!", 9));

		try {
			if(dogs.isEmpty()){
				throw new IllegalArgumentException("The list is Empty.");
			}

			JsonManagement.saveJson(dogs);

		}catch(RuntimeException e){

			System.out.println(e.getMessage());

		}

	}
}

