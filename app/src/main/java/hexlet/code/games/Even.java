package hexlet.code.games;
import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void game2() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Engine.greetingUser();


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");


        int counter = 0;
        int finalCount = 3;
        int endRandomNum = 100;

        for (int i = 0; i < finalCount; i++) {
            int randomNumber = random.nextInt(endRandomNum) + 1;
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
                Engine.trueAns();
                counter += 1;
            } else {
                Engine.falseWord(response, even);
                break;
            }
        }
        if (counter == finalCount) {
            Engine.userWin();
        }

    }
}
