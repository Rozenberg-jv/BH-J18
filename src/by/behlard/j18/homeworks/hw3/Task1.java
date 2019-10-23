package by.behlard.j18.homeworks.hw3;

public class Task1 {

	public static void main(String[] args) {

		int t = 17;
		String result;

		if (t < 10)
			result = "куртку";
		else if (t < 16)
			result = "ветровку";
		else if (t < 20)
			result = "свитер";
		else if (t < 25)
			result = "майку";
		else
			result = "плавки";

		System.out.println("Надень " + result);
	}
}
