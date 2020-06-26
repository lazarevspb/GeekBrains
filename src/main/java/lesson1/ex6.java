package lesson1;

/*
    6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
*/

public class ex6 {
    public static void main(String[] args) {
        System.out.println(negativeValueCheck(-1));
    }

    private static boolean negativeValueCheck(int i) {
        return i < 0;

    }
}
