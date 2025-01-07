package hexlet.code;
import java.util.Scanner;

public class Engine {

    private static String userName;

    //Приветствие и уточнение и имени перед игрой.
    public static void greetingUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

    }
    // Правильный ответ.
    public static void trueAns() {
        System.out.println("Correct!");
    }

    // Неправильный ответ при вводе цифр.
    public static void falseNums(int  userNum, int trueNum) {
        System.out.println(userNum + " is wrong answer ;(. Correct answer was " + trueNum + ".");
        System.out.println("Let's try again, " + userName + "!");
    }

    //Неправильный ответ при вводе слов.
    public static void falseWord(String userWord, String trueWord) {
        System.out.println(userWord + " is wrong answer ;(. Correct answer was " + trueWord + ".");
        System.out.println("Let's try again, " + userName + "!");
    }

    //Поздравление с победой.
    public static void userWin() {
        System.out.println("Congratulations, " + userName + "!");
    }

}
