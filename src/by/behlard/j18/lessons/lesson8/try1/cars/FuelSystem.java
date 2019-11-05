package by.behlard.j18.lessons.lesson8.try1.cars;

import by.behlard.j18.lessons.lesson8.try1.exceptions.InvalidFuelParameterException;

public class FuelSystem {

    private final FuelType type;

    private final int maxValue;

    private int currentValue;

    public FuelSystem(FuelType type, int maxValue, int currentValue) {
        this.type = type;
        this.maxValue = maxValue;
        this.currentValue = currentValue;
    }

    public FuelType getType() {
        return type;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int fillFuel(int newValue) {

        if (newValue <= 0)
            throw new InvalidFuelParameterException("Negative or zero value of fuel");

        if (maxValue > currentValue + newValue) {
            int rest = newValue - (maxValue - currentValue);
            currentValue = maxValue;
            return rest;
        } else {
            currentValue += newValue;
            return 0;
        }
    }

    public void burnFuel(int value) {

        if (value <= 0)
            throw new InvalidFuelParameterException("Negative or zero value of fuel");

        currentValue -= value;

        if (currentValue < 0)
            currentValue = 0;
    }
}
