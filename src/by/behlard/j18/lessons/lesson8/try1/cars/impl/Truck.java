package by.behlard.j18.lessons.lesson8.try1.cars.impl;

import by.behlard.j18.lessons.lesson8.try1.cars.Car;
import by.behlard.j18.lessons.lesson8.try1.cars.FuelSystem;
import by.behlard.j18.lessons.lesson8.try1.cars.FuelType;
import by.behlard.j18.lessons.lesson8.try1.cars.WheelType;

import java.util.Arrays;
import java.util.List;

public class Truck extends Car {
    private static final List<FuelType> possibleFuelTypes =
            Arrays.asList(FuelType.AI92, FuelType.DIESEL);

    public Truck(String title, boolean wheelsOkState, FuelSystem fuelSystem) {
        super(title, WheelType.BIG, wheelsOkState, checkFuel(fuelSystem, possibleFuelTypes));
    }
}
