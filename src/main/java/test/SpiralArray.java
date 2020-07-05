package main.java.test;

import java.util.Arrays;

public class SpiralArray {
    public static void main(String[] args) {

        int[][] spiralArray = new int[3][3];

        int count = 0;
        for (int j = 0; j < spiralArray.length; j++) {
            switch (j) {

                case 0: {
                    for (int k = 0; k < spiralArray[j].length; k++) {
                        spiralArray[j][k] = count++;
                    }
                    break;
                }

                case 1: {
                    for (int k = 0; k < spiralArray[j].length; k++) {
                        spiralArray[j][spiralArray[j].length - 1] = count++;
                        break;
                    }
                    break;
                }

                case 2: {
                    for (int k = spiralArray[j].length - 1; k >= 0; k--) {
                        spiralArray[j][k] = count++;

                    }
                    for (int i = 0; i < spiralArray[j - 2].length - 1; i++) {
                        spiralArray[j - 1][i] = count++;
                    }
                    break;
                }

            }

        }


        printMultiArr(spiralArray);

    }

    private static void printMultiArr(int[][] spiralArray) {
        for (int i = 0; i < spiralArray.length; i++) {//delete
            System.out.println(Arrays.toString(spiralArray[i])); //delete
            System.out.println("");

        }
    }
}
