package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        System.out.println("Задание 1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Изначальный массив " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else arr1[i] =1;
        System.out.println("Замененный массив " + Arrays.toString(arr1));


        //Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;



        System.out.println("Задание 2");
        int[] arr = new int [8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));

        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Задание 3");
        System.out.println("Изначальный массив");
        System.out.println(" 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1");

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr1.length; i++)
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        System.out.println(Arrays.toString(arr2));

        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        System.out.println("Задание 4");
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i==j) {
                    arr4[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr4[i]));
        }

    }
}
