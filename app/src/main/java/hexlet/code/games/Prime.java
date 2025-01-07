package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class Prime {
    public static void game6() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Engine.greetingUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String trueAnswer = "yes";
        int counter = 0;
        for (int i = 0; i < 3; i++) {

            int randomNum = random.nextInt(100) + 1;
            if (randomNum < 2) {
                trueAnswer = "no";
            }

            for (int j = 2; j <= (int) Math.sqrt(randomNum); j++) {
                if (randomNum % j == 0) {
                    trueAnswer = "no";
                    break;
                }
            }
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(trueAnswer)) {
                Engine.trueAns();
                counter += 1;
            } else {
                Engine.falseWord(userAnswer, trueAnswer);
                break;
            }

        }
        if (counter == 3) {
            Engine.userWin();
        }
    }
}
