package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class Progression {
    public static void game5() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Engine.greetingUser();

        System.out.println("What number is missing in the progression?");
        int counter = 0;
        for (int i = 0; i < 3; i++) {



            int randomFirstNum = random.nextInt(100) + 1;
            int randomLength = random.nextInt(5, 10);
            int randomDifference = random.nextInt(1, 10);
            int randomVoid = random.nextInt(1, randomLength);

            System.out.print("Question: ");
            int trueAnswer = 0;
            for (int j = 0; j < randomLength; j++) {
                int progression = randomFirstNum + j * randomDifference;

                if (j == randomVoid) {
                    trueAnswer = progression;
                    System.out.print(".. ");
                } else {
                    System.out.print(progression + " ");
                }
            }
            System.out.print("\nYour answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == trueAnswer) {
                Engine.trueAns();
                counter += 1;
            } else {
                Engine.falseNums(userAnswer, trueAnswer);
                break;
            }
        }
        if (counter == 3) {
            Engine.userWin();
        }
    }
}
