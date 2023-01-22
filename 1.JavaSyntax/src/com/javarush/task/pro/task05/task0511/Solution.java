package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numb = console.nextInt();
        multiArray = new int[numb][];
        for (int i = 0; i < numb; i++) {
            int tmp = console.nextInt();
            multiArray[i] = new int[tmp];
        }
    }
}
