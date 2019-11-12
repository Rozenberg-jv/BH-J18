package by.behlard.j18.homeworks.hw9.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private static final String punktMarks = "!,.-;:?=/";

    public static void main(String[] args) {

        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
                + " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
                + " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
                + " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        // 1
        Map<Character, Integer> map1 = characterFrequencyDictionary1(input);
        for (Map.Entry<Character, Integer> entry : map1.entrySet())
            System.out.printf("%s : %d\n", entry.getKey(), entry.getValue());
        System.out.println("--------");
        // 2
        Map<Character, Long> map2 = characterFrequencyDictionary2(input);
        map2.forEach((k, v) -> System.out.printf("%s : %d\n", k, v));

    }

    private static Map<Character, Integer> characterFrequencyDictionary1(String input) {

        Map<Character, Integer> result = new HashMap<>();

        for (char c : input.toLowerCase().toCharArray()) {

            c = checkForPunktMark(c);

            if (!result.containsKey(c))
                result.put(c, 1);
            else
                result.put(c, result.get(c) + 1);
        }

        return result;
    }

    private static Map<Character, Long> characterFrequencyDictionary2(String input) {

		/*return input.toLowerCase().chars().mapToObj(c -> (char) c).collect(
				HashMap::new,
				(m, c) -> {
					c = checkForPunktMark(c);
					m.put(c, m.containsKey(c) ? m.get(c) + 1 : 1);
				},
				HashMap::putAll);*/

        return input.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toMap(Main::checkForPunktMark, v -> 1L, Long::sum));

//		return input.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Main::checkForPunktMark, Collectors.counting()));
    }

    private static char checkForPunktMark(char c) {

        if (punktMarks.contains(String.valueOf(c)))
            return '!';

        return c;
    }

}
