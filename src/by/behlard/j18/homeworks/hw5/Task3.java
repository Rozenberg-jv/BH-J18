package by.behlard.j18.homeworks.hw5;

public class Task3 {
    public static void main(String[] args) {

        Wardrobe wardrobe = new Wardrobe();

        wardrobe.put(new Clothes("Maika"), 1);
        wardrobe.put(new Clothes("Shtany"), 2);
        wardrobe.put(new Clothes("Noski"), 3);

        wardrobe.seeIntoWardrobe();

        Clothes take = wardrobe.take(1);
        System.out.println(take);

        wardrobe.seeIntoWardrobe();

        wardrobe.put(take, 0);

        wardrobe.throwOntoFreeShelve(new Clothes("Noski"));

        wardrobe.seeIntoWardrobe();

    }
}
