package by.behlard.j18.homeworks.hw4.task1;

public class Building {

    BuildingUsage usageType;
    Address address;
    int floor;
    boolean hasElevator;
    BuildingMaterial material;
    int year;

    public Building(BuildingUsage usageType, Address address,
                    int floor, boolean hasElevator,
                    BuildingMaterial material, int year) {
        this.usageType = usageType;
        this.address = address;
        this.floor = floor;
        this.hasElevator = hasElevator;
        this.material = material;
        this.year = year;
    }
}
