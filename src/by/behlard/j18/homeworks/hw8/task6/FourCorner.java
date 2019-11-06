package by.behlard.j18.homeworks.hw8.task6;

import java.util.ArrayList;
import java.util.List;

public class FourCorner extends AbstractFigure {

	private List<Double> sidesLength = new ArrayList<>();

	public FourCorner(double a, double b, double c, double d) {

		super(4);

		if (a <= 0 || b <= 0 || c <= 0 || d <= 0)
			throw new IllegalArgumentException();

		sidesLength.add(a);
		sidesLength.add(b);
		sidesLength.add(c);
		sidesLength.add(d);
	}

	@Override
	public double getPerimeter() {

		return sidesLength.stream().mapToDouble(value -> value).sum();
	}

	@Override
	public double getSquare() {

		double p = getPerimeter() / 2;

		return Math.sqrt((p - sidesLength.get(0)) * (p - sidesLength.get(1)) * (p - sidesLength.get(2)) * (p - sidesLength.get(3)));
	}

}
