package test;

/*
 *  Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
 *  При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
 *  После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 * */


import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {
        Random randomInt = new Random();
        int guessedNumber = randomInt.nextInt(10);
        int enterValueInt;
        int gameEndInt = 1;

        while (gameEndInt == 1) {
            Scanner scannerInt = new Scanner(System.in);
            int attempts = 1;
            System.out.println("Игра \"Угадай число!\" \nВ вашем распоряжении три попытки.");
            enterValueInt = getIntFromScanner(scannerInt, "Пожалуйста, введите число от 0 до 9: ", -1, 9);
            String[] declensionString = {"попытка", "попытки", "меньше", "больше"};

            while (true) {
                if (enterValueInt == guessedNumber) {
                    System.out.println("Вы угадали, поздравляем!");
                    return;
                } else if (attempts < 3) {
                    String youDidNoGuessString = "Вы не угадали - введенное число "+ ((enterValueInt > guessedNumber) ? declensionString[3] : declensionString[2])+
                            " загаданного.\nПопробуйте еще раз.\nУ вас осталось " + (3 - attempts) + " " + ((3 - attempts == 1) ? declensionString[0] : declensionString[1]);
                    enterValueInt = getIntFromScanner(scannerInt, youDidNoGuessString, -1, 9);
                    attempts++;
                } else {
                    System.out.println("Ваши попытки закончились, вы не отгадали! \nЗагаданное число: " + guessedNumber);
                    gameEndInt = getIntFromScanner(scannerInt, "Повторить игру еще раз? 1 – да / 0 – нет»", -1, 2);
                    if (gameEndInt == 1) {
                        break;
                    } else {
                        scannerInt.close();
                        return;
                    }
                }
            }
        }
    }

    private static int getIntFromScanner(Scanner scannerInt, String stringSource, int first, int last) {
        int enterInt;
        do {
            System.out.println(stringSource);
            enterInt = scannerInt.nextInt();
        } while (enterInt < first || enterInt > last);
        return enterInt;
    }
}
