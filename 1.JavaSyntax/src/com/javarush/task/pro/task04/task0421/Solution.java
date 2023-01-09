package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i < 101) {
            if (i % 2 != 0) {
                i++;
                continue;
            }else {
                sum = sum + i;
                i++;
            }
        }
        System.out.println(sum);

    }
}