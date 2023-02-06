package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length - 1; ) {
            for (int j = array.length - 1; j > -1; ) {
                tmp[i] = array[j];
                j--;
                i++;
                continue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=tmp[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
