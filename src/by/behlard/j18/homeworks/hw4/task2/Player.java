package by.behlard.j18.homeworks.hw4.task2;

@SuppressWarnings("all")
public class Player {

    private double x, y;
    private double distance;

    public Player() {

        this(0, 0);
    }

    public Player(double x, double y) {
        this.x = x;
        this.y = y;
        this.distance = 0;
    }

    public void move(double newX, double newY) {

        distance += calcDistance(newX, newY);

        x = newX;
        y = newY;
    }

    public void printCurrentPosition() {

        System.out.printf("position: [%.2f : %.2f], passed distance: %.2f\n", x, y, distance);
    }

    private double calcDistance(double x, double y) {

        double result = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

        return result;
    }

    @Override
    public String toString() {

        return String.format("Player[%.2f : %.2f], distance: %.2f", x, y, distance);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        if (distance < 0)
            System.out.println("error");
        else
            this.distance = distance;
    }
}
