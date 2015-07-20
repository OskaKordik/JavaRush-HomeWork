package Hippodrome;
import java.util.ArrayList;
/*
.......................................................................................................................................................Stella
.....................................................................................................................................................Jozeff
................................................................................................................................Rihard


Winner is Stella!
*/
public class Hippodrome {
    static ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public static void main(String[] args) {
        game = new Hippodrome();
        horses.add(new Horse("Stella", 3, 0));
        horses.add(new Horse("Jozeff", 3, 0));
        horses.add(new Horse("Rihard", 3, 0));
        game.run();
        game.printWinner();
    }
    public ArrayList<Horse> getHorses() {
        return horses;
    }
    public void run() {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {  Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void move() {
        for (Horse h: horses) h.move();
    }
    public void print() {
        for (Horse h: horses) h.print();
        System.out.println();
        System.out.println();
    }
    public Horse getWinner() {
        Horse horseWinner = getHorses().get(0);
        for (Horse horse: horses) {
            if (horse.getDistance() > horseWinner.getDistance()) horseWinner = horse;
        }
        return horseWinner;
    }
    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
