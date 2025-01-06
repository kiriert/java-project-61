package hexlet.code;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();


        if (gameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.scanner();
        } else if (gameNumber == 2) {
            Even.game2();
        } else {
            System.out.println("Bye!Bye!");
        }

    }
}
