package Lesson2;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] Args) {
        //        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание 1.");
        int[] array1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array1));
        switchNumbers(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("Задание 2.");
        int[] zeroArr = new int[8];
        System.out.println(Arrays.toString(zeroArr));
        placeNumbers(zeroArr);
        System.out.println(Arrays.toString(zeroArr));
        System.out.println("Задание 3.");
        int[] array2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array2));
        multiplyNumbers(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println("Задание 4.");
        int[][] square = new int[6][6];
        drawX(square);
        printSquare(square);
        System.out.println("Задание 5.");
        MaxAndMin();

    }
// метод меняющий числа
    static void switchNumbers(int[] inputArray) {
        for(int i = 0; i < inputArray.length; ++i) {
            inputArray[i] = 1 - inputArray[i];
        }

    }
    // метод заполняющий значения
    static void placeNumbers(int[] inputArray) {
        for(int i = 0; i < inputArray.length; ++i) {
            inputArray[i] = i * 3;
        }

    }
    // умножающий метод
    static void multiplyNumbers(int[] inputArray) {
        for(int i = 0; i < inputArray.length; ++i) {
            if (inputArray[i] < 6) {
                inputArray[i] *= 2;
            }
        }

    }
    //метод печатает двумерный массив
    static void printSquare(int[][] inputSquare) {
        for(int i = 0; i < inputSquare.length; ++i) {
            System.out.println(Arrays.toString(inputSquare[i]));
        }

    }
    //метод заполняющий диагонали еденицами
    static void drawX(int[][] square) {
        for(int i = 0; i < square.length; ++i) {
            square[i][i] = 1;
            square[i][square[i].length - 1 - i] = 1;
        }

    }
    //находим максимум и минимум
    public static void MaxAndMin(){
        int [] a = new int[20];
        for (int i = 0; i < a.length ; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int element : a){
            System.out.print(element + " ");
        }
        System.out.println();
        int max = a[0];
        for (int i : a){
            if (i > max){
                max = i;
            }
        }
        System.out.println("Максимум " + max);

        int min = a[0];
        for (int i: a){
            if (i < min){
                min = i;
            }
        }
        System.out.println("Минимум " + min);
    }
    private static boolean checkBalance(int[] mass) {
        int right = 0;
        int left = 0;

        for(int i = 0; i < mass.length - 1; i++) {
            left += mass[i];
            for (int j = i + 1; j < mass.length; j++) {
                right += mass[j];
            }
            if (left == right) {
                return  true;
            }
            right = 0;
        }
        return  false;
    }
}
