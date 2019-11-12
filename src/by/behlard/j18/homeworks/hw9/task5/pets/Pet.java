package by.behlard.j18.homeworks.hw9.task5.pets;

public abstract class Pet {

	private final String name;
	private String mastersName;

	public Pet(String name) {

		this.name = name;
	}

	public abstract void play();

	public String getName() {

		return name;
	}

	public String getMastersName() {

		return mastersName;
	}

	public void setMastersName(String mastersName) {

		this.mastersName = mastersName;
	}
}
