package by.behlard.j18.lessons.lesson9.stuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>() {{
            add("one");
            add("two");
            add("three");
            add("three");
            add("five");
            add("six");
        }};

       /* for (String s : list) {
            if (s.equals("three"))
                list.remove(s);

            System.out.println(s);
        }*/

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("three"))
                list.remove(list.get(i));

            System.out.println(list.get(i));
        }

        /*Iterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("three")) {
                iterator.remove();
                continue;
            }

            System.out.println(next);
        }*/

        System.out.println(list);
    }
}
