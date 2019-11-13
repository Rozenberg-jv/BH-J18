package by.behlard.j18.homeworks.hw8.task5.pets;

public class Dog extends Pet {

	public Dog(String name) {

		super(name);
	}

	@Override
	public void play() {

		System.out.printf("%s says \"WOOF!WOOF!\" and tumbles through itself\n", super.getName());
	}
}
