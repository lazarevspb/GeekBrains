package lesson1;

/*
    8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.
*/

public class Ex8 {
    public static void main(String[] args) {
        leapYearCheck(1600);
        leapYearCheck(1604);
        leapYearCheck(1605);
        leapYearCheck(1606);
        leapYearCheck(1607);
        leapYearCheck(1608);
        leapYearCheck(1700);
        leapYearCheck(1800);
        leapYearCheck(1900);
        leapYearCheck(2000);
    }

    private static void leapYearCheck(int year) {
        String yearValue = ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) ?
                year + ": является високосным годом" : year + ": не является високосным годом";
        System.out.println(yearValue);
    }
}


