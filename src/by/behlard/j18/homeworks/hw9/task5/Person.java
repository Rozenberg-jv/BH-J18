package by.behlard.j18.homeworks.hw9.task5;

import by.behlard.j18.homeworks.hw9.task5.pets.Pet;

public class Person {

	private final String name;

	private Pet pet;

	public Person(String name, Pet pet) {

		this.name = name;

		this.pet = pet;
		pet.setMastersName(name);
	}

	public Person(String name) {

		this.name = name;
	}

	public void play() {

		if (pet != null) {
			System.out.printf("%s plays with %s\n", name, pet.getName());
			pet.play();
		}
	}

	public void play(Pet pet) {

		if (pet != null) {
			System.out.printf("%s plays with %s pet, %s\n", name, pet.getMastersName() != null ? pet.getMastersName() + "'s" : "homeless", pet.getName());
			pet.play();
		}
	}

	public Pet getPet() {

		return pet;
	}
}
