package lesson1;

/*
    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет,
    указанное_имя!»;
*/

public class Ex7 {
    public static void main(String[] args) {

        printName("Иван");
    }

    private static void printName(String name) {
        System.out.println("Привет, " + name + '!');
    }
}
