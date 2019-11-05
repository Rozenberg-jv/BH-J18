package by.behlard.j18.lessons.lesson8.try1.cars.impl;

import by.behlard.j18.lessons.lesson8.try1.cars.Car;
import by.behlard.j18.lessons.lesson8.try1.cars.FuelSystem;
import by.behlard.j18.lessons.lesson8.try1.cars.FuelType;
import by.behlard.j18.lessons.lesson8.try1.cars.WheelType;
import by.behlard.j18.lessons.lesson8.try1.exceptions.InvalidFuelParameterException;

import java.util.Arrays;
import java.util.List;

public class Sedan extends Car {

    private static final List<FuelType> possibleFuelTypes =
            Arrays.asList(FuelType.AI92, FuelType.AI98);

    public Sedan(String title, boolean wheelsOkState, FuelSystem fuelSystem) {
        super(title, WheelType.SMALL, wheelsOkState, checkFuel(fuelSystem, possibleFuelTypes));
    }

}
