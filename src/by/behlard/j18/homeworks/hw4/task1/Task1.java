package by.behlard.j18.homeworks.hw4.task1;

public class Task1 {

    public static void main(String[] args) {

//        Address address = new Address("Logoysky tr.", 1);

        Building building1 = new Building(BuildingUsage.LIVING, new Address("Logoysky tr.", 1),
                2, false, BuildingMaterial.WOOD, 1971);
        System.out.println(building1.address.house);
    }
}
