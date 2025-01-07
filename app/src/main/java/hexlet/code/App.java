package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n"
                + "4 - GCD\n" + "5 - Progression\n" + "6 - Prime\n" + "0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();


        if (gameNumber == 1) {
            Cli.scanner();
        } else if (gameNumber == 2) {
            Even.game2();
        } else if (gameNumber == 3) {
            Calc.game3();
        } else if (gameNumber == 4) {
            GCD.game4();
        } else if (gameNumber == 5) {
            Progression.game5();
        } else if (gameNumber == 6) {
            Prime.game6();
        } else {
            System.out.println("Bye!Bye!");
        }

    }
}
