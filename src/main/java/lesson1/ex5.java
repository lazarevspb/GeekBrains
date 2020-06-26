package lesson1;

/*
    5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консолположительное ли число
*/

public class ex5 {
    public static void main(String[] args) {
        signCheck(0);
    }

    private static void signCheck(int i) {
        if (i >= 0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");

    }
}
