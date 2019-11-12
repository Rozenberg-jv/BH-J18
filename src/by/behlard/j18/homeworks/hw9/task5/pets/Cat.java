package by.behlard.j18.homeworks.hw9.task5.pets;

public class Cat extends Pet {

	public Cat(String name) {

		super(name);
	}

	@Override
	public void play() {

		System.out.printf("%s says \"MEEEOOOWW\"\n", this.getName());
	}
}
