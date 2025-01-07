package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class GCD {
    public static void game4() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Engine.greetingUser();

        System.out.println("Find the greatest common divisor of given numbers.");

        int counter = 0;
        int finalCount = 3;
        int endRandomNum = 100;

        for (int i = 0; i < finalCount; i++) {
            int randomNum1 = random.nextInt(endRandomNum) + 1;
            int randomNum2 = random.nextInt(endRandomNum) + 1;

            System.out.println("Question: " + randomNum1 + " " + randomNum2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            while (randomNum2 != 0) {
                int temp = randomNum2;
                randomNum2 = randomNum1 % randomNum2;
                randomNum1 = temp;
            }
            int correctAnswer = randomNum1;

            if (userAnswer == correctAnswer) {
                Engine.trueAns();
                counter += 1;
            } else {
                Engine.falseNums(userAnswer, randomNum1);
                break;
            }

        }
        if (counter == finalCount) {
            Engine.userWin();
        }
    }
}
