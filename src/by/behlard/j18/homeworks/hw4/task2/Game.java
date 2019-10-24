package by.behlard.j18.homeworks.hw4.task2;

public class Game {

    public static void main(String[] args) {

        Player player1 = new Player();

        player1.printCurrentPosition();
        player1.move(3, 4);
        player1.printCurrentPosition();
        player1.move(0, 0);
        player1.printCurrentPosition();
        player1.move(10, 10);
        player1.printCurrentPosition();

        System.out.println(player1.toString());
        System.out.println(new Player());

        System.out.println(5 + 11 + " pieces");
        System.out.println("pieces " + 5 + 11);

    }
}
