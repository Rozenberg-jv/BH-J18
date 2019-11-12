package by.behlard.j18.homeworks.hw9.task1;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> input = Arrays.asList(
				"aaa",
				"bbb",
				"qwerty",
				".",
				"abcde",
				"ccc",
				"",
				"..\t\t.",
				"ddd",
				"1234567",
				"!!!!!"
		);

		String result1 = lessThanFive1(input);
		String result2 = lessThanFive2(input);

		System.out.println(result1);
		System.out.println(result2);
	}

	private static String lessThanFive1(List<String> input) {

		String result = "";

		for (String s : input) {
			if (s.length() < 5)
				result += s + " ";
		}

		return result.trim();
	}

	private static String lessThanFive2(List<String> input) {

		if (input.size() == 0)
			return "";

		StringBuilder sb = new StringBuilder();

		for (String s : input)
			if (s.length() < 5)
				sb.append(s).append(" ");

		return sb.deleteCharAt(sb.length() - 1).toString();
	}

}
