package com.javarush.task.pro.task05.task0511;

import java.sql.SQLOutput;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number =console.nextInt() ;

        multiArray = new int[number][];
        for (int i = 0; i < multiArray.length; i++) {
            int num = console.nextInt();
            multiArray[i] = new int[num];
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }

    }
}
