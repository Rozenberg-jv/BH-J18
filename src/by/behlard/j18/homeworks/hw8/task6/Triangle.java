package by.behlard.j18.homeworks.hw8.task6;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends AbstractFigure {

	private List<Double> sidesLength = new ArrayList<>();

	public Triangle(double a, double b, double c) {

		super(3);

		if (a <= 0 || b <= 0 || c <= 0)
			throw new IllegalArgumentException();

		sidesLength.add(a);
		sidesLength.add(b);
		sidesLength.add(c);
	}

	@Override
	public double getPerimeter() {

		return sidesLength.stream().mapToDouble(value -> value).sum();
	}

	@Override
	public double getSquare() {

		double p = getPerimeter() / 2;

		return Math.sqrt(p * (p - sidesLength.get(0)) * (p - sidesLength.get(1)) * (p - sidesLength.get(2)));
	}
}
