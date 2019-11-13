package by.behlard.j18.homeworks.hw8.task5.pets;

public class Fish extends Pet {

	public Fish(String name) {

		super(name);
	}

	@Override
	public void play() {

		System.out.printf("%s swims in a circle\n", getName());
	}
}
