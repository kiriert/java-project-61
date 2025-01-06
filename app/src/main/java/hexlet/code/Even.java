package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void game2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name1 = scanner.nextLine();
        System.out.println("Hello, " + name1 + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String response = scanner.nextLine();
            String even = "";
            if (randomNumber % 2 == 0) {
                even = "yes";
            } else {
                even = "no";
            }
            if (response.equals(even)) {
                System.out.println("Correct!");
                counter += 1;
            } else {
                System.out.println(response + " is wrong answer ;(. Correct answer was " + even + ".");
                System.out.println("Let's try again, " + name1 + "!");
                break;
            }
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + name1 + "!");
        }

    }
}
