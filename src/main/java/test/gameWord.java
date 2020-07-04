package test;

/*
* * Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
*  "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
*  "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
*  "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его
* с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер
*  показывает буквы, которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно можно пользоваться:
String str = "apple";
char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово.
Используем только маленькие буквы.
* */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class gameWord {
    public static void main(String[] args) {
        boolean flagWin = false;

        String resultString, userAnswer;
        Scanner scannerInputWord = new Scanner(System.in);
        Random guessRandomIntForWord = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        String guessWordString = words[guessRandomIntForWord.nextInt(words.length - 1)];

        while (!flagWin) {
            do {
                System.out.println("Введите название фрукта или овоща на английском языке, например \"apple\": ");
                userAnswer = scannerInputWord.next().toLowerCase();
            } while (!checkCharInput(userAnswer));

            if (guessWordString.equals(userAnswer)) {
                System.out.printf("%nВы угадали, поздравляем.%n");
                flagWin = true;
            } else {
                resultString = comparisonChar(userAnswer, guessWordString);
                System.out.printf("%s%n%s%n%s%n", "Вы смогли угадать только указанные ниже буквы: ", resultString, "Попробуйте еще. ");
            }
        }
    }

    private static String comparisonChar(String userAnswer, String guessWordString) {
        String stringComparison = "";
        int iterationLength = Math.min(guessWordString.length(), userAnswer.length());
        for (int i = 0; i < iterationLength; i++) {
            if (guessWordString.charAt(i) == userAnswer.charAt(i)) {
                stringComparison += userAnswer.charAt(i);
            } else {
                stringComparison += '#';
            }
        }
        for (int i = 0; i < 15 - guessWordString.length(); i++) {
            stringComparison += '#';
        }
        return stringComparison;
    }
    public static boolean checkCharInput(String name) {
        return name.matches("[a-zA-Z]+");
    }
}
