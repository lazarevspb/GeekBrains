package main.java.lesson2;
/*

**** Написать метод, которому на вход подается одномерный массив и число n (может быть
положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
 Для усложнения задачи нельзя пользоваться вспомогательными массивами.

*/


import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int shiftQuantity = -9;


        shiftArray(arrayInt, shiftQuantity);
        System.out.println(Arrays.toString(arrayInt));

    }

    public static void shiftArray(int[] arrayInstance, int quantity) {
        if (quantity > -1 && quantity <= arrayInstance.length) {
            for (int j = arrayInstance.length - quantity; j > 0; j--) {
                arrayInstance[j + quantity - 1] = arrayInstance[j - 1];
            }
            for (int i = 0; i < quantity; i++) {
                arrayInstance[i] = 0;
            }
        } if (quantity < 0 && (quantity * -1) <= arrayInstance.length)  {
            for (int j = 0; j < arrayInstance.length + quantity; j++) {
                arrayInstance[j] = arrayInstance[j - quantity];
            }
            for (int i = (arrayInstance.length-1) + quantity ; i < arrayInstance.length-1; i++) {
                arrayInstance[i+1] = 0;
            }
            }


        }
    }
