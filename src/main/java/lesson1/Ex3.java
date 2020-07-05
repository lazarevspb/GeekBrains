package lesson1;

/*
    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
*/

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(calculation(10, 10, 10, 10));
    }

    private static int calculation(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
}
