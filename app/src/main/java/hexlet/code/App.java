package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();


        if (gameNumber == 1) {
            Cli.scanner();
        } else if (gameNumber == 2) {
            Even.game2();
        } else if (gameNumber == 3) {
            Calc.game3();
        } else {
            System.out.println("Bye!Bye!");
        }

    }
}
