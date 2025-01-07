package hexlet.code.games;
import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class Calc {
    public static void game3() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Engine.greetingUser();

        System.out.println("What is the result of the expression?");

        int counter = 0;

        for (int i = 0; i < 3; i++) {

            int randomNumber1 = random.nextInt(100) + 1;
            int randomNumber2 = random.nextInt(100) + 1;

            char[] operations = {'+', '-', '*'};
            char operation = operations[random.nextInt(operations.length)];

            int trueAnswer = 0;
            switch (operation) {
                case '+':
                    trueAnswer = randomNumber1 + randomNumber2;
                    break;
                case '-':
                    trueAnswer = randomNumber1 - randomNumber2;
                    break;
                case '*':
                    trueAnswer = randomNumber1 * randomNumber2;
                    break;
                default:
                    break;
            }
            System.out.println("Question: " + randomNumber1 + operation + randomNumber2);
            System.out.print("Your answer: ");
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
