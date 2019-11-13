package by.behlard.j18.homeworks.hw8.task5;

import by.behlard.j18.homeworks.hw8.task5.pets.Cat;
import by.behlard.j18.homeworks.hw8.task5.pets.Dog;
import by.behlard.j18.homeworks.hw8.task5.pets.Fish;

public class Main {

	public static void main(String[] args) {

		Person misha = new Person("Misha", new Cat("Barsik"));
		Person vanya = new Person("Vanya", new Dog("Reks"));
		Person olya = new Person("Olya", new Fish("Blob"));

		misha.play();
		vanya.play();
		olya.play();

		misha.play(vanya.getPet());
		olya.play(new Cat("Ryzhik"));
	}

}
