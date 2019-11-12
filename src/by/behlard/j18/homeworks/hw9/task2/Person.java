package by.behlard.j18.homeworks.hw9.task2;

import java.util.Objects;

public class Person {

	private String name;

	public Person(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

	@Override
	public String toString() {

		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Person))
			return false;
		Person person = (Person) o;
		return Objects.equals(name, person.name);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name);
	}
}
