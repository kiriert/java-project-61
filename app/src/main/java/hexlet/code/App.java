package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Cli;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Выбор игры.
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n"
                + "4 - GCD\n" + "5 - Progression\n" + "6 - Prime\n" + "0 - Exit");
        System.out.print("Your choice: ");
        int userSelection = scanner.nextInt();
        int gameCli = 1;
        int gameEven = 2;
        int gameCalc = 3;
        int gameGCD = 4;
        int gameProgression = 5;
        int gamePrime = 6;


        if (userSelection == gameCli) {
            Cli.scanner();
        } else if (userSelection == gameEven) {
            Even.game2();
        } else if (userSelection == gameCalc) {
            Calc.game3();
        } else if (userSelection == gameGCD) {
            GCD.game4();
        } else if (userSelection == gameProgression) {
            Progression.game5();
        } else if (userSelection == gamePrime) {
            Prime.game6();
        } else {
            System.out.println("Bye!Bye!");
        }

    }
}
