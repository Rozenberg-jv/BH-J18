package by.behlard.j18.homeworks.hw8.task6;

public class Main {

	public static void main(String[] args) {

		Figure figure1 = new Triangle(1, 1, 3);
		printPerimeterAndSquare(figure1);
		figure1 = new FourCorner(3, 3, 3, 3);
		printPerimeterAndSquare(figure1);
	}

	public static void printPerimeterAndSquare(Figure figure) {

		System.out.printf("Perimeter: %5.2f\n", figure.getPerimeter());
		System.out.printf("Square: %5.2f\n", figure.getSquare());
	}

}
