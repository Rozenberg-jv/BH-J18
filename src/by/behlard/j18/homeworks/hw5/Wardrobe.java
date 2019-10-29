package by.behlard.j18.homeworks.hw5;

public class Wardrobe {

    private Clothes[] shelves = new Clothes[3];

    public void put(Clothes clothes, int shelveNumber) {
        if (shelveNumber < 0 || shelveNumber >= shelves.length) {
            System.out.println("Invalid input");
            return;
        }

        if (shelves[shelveNumber] == null) {
            shelves[shelveNumber] = clothes;
            System.out.printf("put %s on %d shelve\n", clothes, shelveNumber);
        } else
            System.out.println("Shelve is occupied");
    }

    public void throwOntoFreeShelve(Clothes clothes) {

        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] == null) {
                shelves[i] = clothes;
                System.out.printf("throw %s on %d shelve\n", clothes, i);
                return;
            }
        }

        System.out.println("There is no empty shelve");
    }

    public Clothes take(int shelveNumber) {

        Clothes result = null;

        if (shelves[shelveNumber] == null)
            System.out.printf("There is no clothes on %d shelve\n", shelveNumber);
        else {
            result = shelves[shelveNumber];
            shelves[shelveNumber] = null;
        }

        return result;
    }

    public void seeIntoWardrobe() {
        System.out.println("------- Wardrobe -------");
        for (Clothes c : shelves)
            System.out.println(c);
    }
}
