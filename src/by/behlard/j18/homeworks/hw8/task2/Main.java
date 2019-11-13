package by.behlard.j18.homeworks.hw8.task2;

import java.util.Arrays;
import java.util.List;

public class Main {

	private static List<Person> persons;

	public static void main(String[] args) {

		persons = Arrays.asList(
				new Person("Oleg"),
				new Person("Ivan"),
				new Person("Maria"),
				new Person("Olga"),
				new Person("Vasily"),
				new Person("Daniil"),
				new Person("Tatyana")
		);

		Person result1 = getPerson1("Vasily");
		Person result2 = getPerson2("Olga");

		System.out.println(result1);
		System.out.println(result2);
	}

	private static Person getPerson1(String name) {

		for (Person p : persons) {
			if (p.getName().equals(name))
				return p;
		}

		return null;
	}

	private static Person getPerson2(String name) {

		return persons.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
	}

}
